package org.lycoding.fastcode.builder;

import org.lycoding.fastcode.bean.Constants;
import org.lycoding.fastcode.bean.TableInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

public class GeneratePo {
    private static final Logger logger= LoggerFactory.getLogger(GeneratePo.class);
    public static void execute() throws IOException, SQLException {
//        java文件基本路径（肯定存在）
        String basePath= Constants.BASE_PATH+Constants.JAVA_PATH;
        String packagePath=Constants.PACKAGE_PATH;
        String poPackage=Constants.PO_PATH.replace('.','/');

        Path basePackagePath= Paths.get(basePath,packagePath);
        Path poPackagePath=Paths.get(basePath+packagePath+poPackage);

//        判断基本包路径是否存在，否则创建
        if (!(Files.exists(basePackagePath)&&Files.isDirectory(basePackagePath))){
            Files.createDirectories(basePackagePath);
        }
//       判断po包路径是否存在，否则创建
        if (!(Files.exists(poPackagePath)&&Files.isDirectory(poPackagePath))){
            Files.createDirectories(poPackagePath);
        }

//       创建pojo类
        List<TableInfo> tableList = TableBuilder.getTableList();
        for (TableInfo tableInfo : tableList) {
            Path beanPath = Paths.get(poPackagePath.toString()+ "/"+tableInfo.getBeanName() + Constants.JAVA_FILE_SUFFIX);
//            bean文件不存在则创建
            if (!(Files.exists(beanPath))){
                Files.createFile(beanPath);
            }

            OutputStream ops = null;
            BufferedOutputStream bos = null;
            try{
                ops=new FileOutputStream(beanPath.toString());
                bos=new BufferedOutputStream(ops);
                bos.write(("package "+packagePath+poPackage+";").replaceAll("/",".").getBytes(StandardCharsets.UTF_8));
                bos.write(new byte[]{'\n','\n'});
                bos.write(("public class "+tableInfo.getBeanName()+"{"+" }").getBytes(StandardCharsets.UTF_8));

                bos.flush(); // 刷新缓冲区，确保数据被写入文件

            }catch (Exception e){
                e.printStackTrace();
            }


        }
//        logger.info("{}", JSONUtil.toJsonPrettyStr(tableList));

    }

}
