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
    public static void execute(List<TableInfo> tableList){
        //        java文件基本路径（肯定存在）
        final String SERVICE_PATH= Constants.BASE_PATH+Constants.JAVA_PATH+Constants.PACKAGE_PATH+Constants.SOURCE_SERVICE.replace(".","/");
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

        /**
         * 1.创建service接口
         * 2.创建service实现类
         */
        for (TableInfo tableInfo : tableList) {
            Path servicePath = Paths.get(servicePackagePath.toString()+ "/"+tableInfo.getBeanName() + "Service"+ Constants.JAVA_FILE_SUFFIX);
            Path serviceImplPath = Paths.get(servicePackagePath.toString()+ "/impl/"+tableInfo.getBeanName() + "ServiceImpl"+ Constants.JAVA_FILE_SUFFIX);
            /** service文件不存在则创建，否则直接将源文件覆盖 */
            if (!(Files.exists(servicePath))){
                try {
                    Files.createFile(servicePath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            /** impl文件不存在则创建，否则直接将源文件覆盖 */
            if (!(Files.exists(serviceImplPath))){
                try {
                    Files.createFile(serviceImplPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

//            使用字符输出流将指定格式的文本写入java文件中
            Writer writer=null;
            BufferedWriter bw = null;
            try{
                /** 写入service接口文件 */
                writer = new FileWriter(servicePath.toString(),false);
                bw = new BufferedWriter(writer);
                bw.write(("package "+Constants.SERVICE_PACKAGE)+";");
                bw.newLine();
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment());
                bw.write(("public interface "+tableInfo.getBeanName()+"Service {"));
                bw.newLine();
                bw.write("\n}");
                bw.flush(); // 刷新缓冲区，确保数据被写入文件

                /** 写入service实现类文件 */
                writer = new FileWriter(serviceImplPath.toString(),false);
                bw = new BufferedWriter(writer);
                bw.write(("package "+Constants.SERVICE_PACKAGE)+".impl;");
                bw.newLine();
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment());
                bw.write(("public class "+tableInfo.getBeanName()+"ServiceImpl {"));
                bw.newLine();
                bw.write("\n}");
                bw.flush(); // 刷新缓冲区，确保数据被写入文件
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
