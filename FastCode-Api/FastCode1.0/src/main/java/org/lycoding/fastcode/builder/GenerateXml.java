package org.lycoding.fastcode.builder;

import org.lycoding.fastcode.bean.Constants;
import org.lycoding.fastcode.bean.TableInfo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GenerateXml {
    public static void execute(List<TableInfo> tableList) throws IOException {
        String basePackage= Constants.BASE_PATH;
        String resourcePath=Constants.RESOURCE_PATH;
        String xmlFolder=basePackage+resourcePath+"mybatis/";
        String xmlFiles=xmlFolder+"Employer"+Constants.MYBATIS_FILE_SUFFIX;

        //      文件路径：判断文件夹、文件是否存在，创建文件夹、文件都需要用到
        Path xmlFolderPath= Paths.get(xmlFolder);
        Path xmlFilePath= Paths.get(xmlFiles);

        //       判断是否创建mybatis文件夹
        if (!(Files.exists(xmlFolderPath)&&Files.isDirectory(xmlFolderPath))){
            Files.createDirectories(xmlFolderPath);
        }

//      判断是否创建xml文件
        if (!(Files.exists(xmlFilePath)&&Files.isRegularFile(xmlFilePath))){
            Files.createFile(xmlFilePath);
        }
    }

}
