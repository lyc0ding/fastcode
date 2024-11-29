package org.lycoding.fastcode;

import org.lycoding.fastcode.bean.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test {
    public static final Logger logger = LoggerFactory.getLogger(test.class);
    public static void main(String[] args) throws IOException {
        String basePackage= Constants.BASE_PATH;
        String resourcePath=Constants.RESOURCE_PATH;
        String xmlSuffix=Constants.MYBATIS_FILE_SUFFIX;
        String xmlFolder=basePackage+resourcePath+"mybatis/";
        String xmlFiles=xmlFolder+"Employer"+xmlSuffix;

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

//      将字符串写输出到文件
        FileWriter fileWriter = new FileWriter(String.valueOf(xmlFilePath),true);
        BufferedWriter bw=new BufferedWriter(fileWriter);
        bw.write("你好");
        bw.flush();//立即将缓冲区数据刷新到文件


        FileReader fileReader = new FileReader(String.valueOf(xmlFilePath));
        BufferedReader br = new BufferedReader(fileReader);
        String reader=null;
        System.out.println(br.read());
//        while ((reader=br.read())!=null){
//            System.out.println(reader);
//        }


    }
}
