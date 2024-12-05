package org.lycoding.fastcode.builder;

import org.lycoding.fastcode.bean.Constants;
import org.lycoding.fastcode.bean.TableInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

public class GenerateService {
    private static final Logger logger= LoggerFactory.getLogger(GenerateService.class);
    public static void execute(){
        //        java文件基本路径（肯定存在）
        final String SERVICE_PATH= Constants.BASE_PATH+Constants.JAVA_PATH+Constants.PACKAGE_PATH+Constants.SOURCE_SERVICE.replace(".","/");
//        System.out.println(Constants.BASE_PATH+Constants.JAVA_PATH+Constants.PACKAGE_PATH+Constants.SOURCE_SERVICE.replace(".","/"));
        logger.info("{}",SERVICE_PATH + "/impl");
        Path servicePackagePath= Paths.get(SERVICE_PATH);

//        判断基本包路径是否存在，否则创建
        if (!(Files.exists(servicePackagePath)&&Files.isDirectory(servicePackagePath))){
            try {
                Files.createDirectory(servicePackagePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Path implPath = Paths.get(SERVICE_PATH + "/impl");
            try {
                Files.createDirectory(implPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//       判断service包路径是否存在，否则创建
        if (!(Files.exists(servicePackagePath)&&Files.isDirectory(servicePackagePath))){
            try {
                Files.createDirectories(servicePackagePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//       创建Mapper类
        List<TableInfo> tableList = null;
        try {
            tableList = TableBuilder.getTableList();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (tableList.isEmpty()){
            logger.warn("表内容为空！！");
            return;
        }

        for (TableInfo tableInfo : tableList) {
            Path beanPath = Paths.get(servicePackagePath.toString()+ "/"+tableInfo.getBeanName() + "Service"+ Constants.JAVA_FILE_SUFFIX);
//            bean文件不存在则创建，否则直接将源文件覆盖
            if (!(Files.exists(beanPath))){
                try {
                    Files.createFile(beanPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

//            使用字符输出流将指定格式的文本写入java文件中
            Writer writer=null;
            BufferedWriter bw = null;
            try{
                writer = new FileWriter(beanPath.toString(),false);
                bw = new BufferedWriter(writer);
                bw.write(("package "+Constants.SERVICE_PACKAGE)+";");
                bw.newLine();
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment(),Constants.AUTHOR);
                bw.write(("public interface "+tableInfo.getBeanName()+"Service {"));
                bw.newLine();
                bw.write("\n}");

                bw.flush(); // 刷新缓冲区，确保数据被写入文件

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
