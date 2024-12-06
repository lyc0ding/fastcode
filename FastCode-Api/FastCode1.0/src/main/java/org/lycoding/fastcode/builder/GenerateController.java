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
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class GenerateController {
    private static final Logger logger= LoggerFactory.getLogger(GenerateController.class);
    public static void execute(List<TableInfo> tableList) throws IOException, SQLException {
//        java文件基本路径（肯定存在）
        final String MAPPER_PATH= Constants.BASE_PATH+Constants.JAVA_PATH+Constants.PACKAGE_PATH+Constants.SOURCE_CONTROLLER.replace(".","/");
        Path controllerPackagePath= Paths.get(MAPPER_PATH);

//        判断基本包路径是否存在，否则创建
        if (!(Files.exists(controllerPackagePath)&&Files.isDirectory(controllerPackagePath))){
            Files.createDirectories(controllerPackagePath);
        }

//       判断controller包路径是否存在，否则创建
        if (!(Files.exists(controllerPackagePath)&&Files.isDirectory(controllerPackagePath))){
            Files.createDirectories(controllerPackagePath);
        }

        for (TableInfo tableInfo : tableList) {
            Path beanPath = Paths.get(controllerPackagePath.toString()+ "/"+tableInfo.getBeanName()+"Controller" + Constants.JAVA_FILE_SUFFIX);
//            bean文件不存在则创建，否则直接将源文件覆盖
            if (!(Files.exists(beanPath))){
                Files.createFile(beanPath);
            }

//            使用字符输出流将指定格式的文本写入java文件中
            Writer writer=null;
            BufferedWriter bw = null;
            try{
                writer = new FileWriter(beanPath.toString(),false);
                bw = new BufferedWriter(writer);
                bw.write(("package "+Constants.CONTROLLER_PACKAGE)+";");
                bw.newLine();
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment());
                bw.write("\t@RestController");
                bw.newLine();
                bw.write("\t@RequestMapping(value = \"/+"+tableInfo.getTableName()+"\")");
                bw.newLine();
                bw.write(("public class "+tableInfo.getBeanName()+"Controller {"));
                bw.newLine();
                bw.write("\t@Autowired");
                bw.newLine();
                bw.write("\tprivate "+tableInfo.getBeanName()+"Service "+tableInfo.getTableName()+";");
                bw.newLine();
                CommentsBuilder.getComment4Methods(bw,"新增");
                bw.write("\tpublic Object insert"+" ("+tableInfo.getBeanName() +" "+ tableInfo.getObjectName()+"){");

                bw.write("\n}");

                bw.flush(); // 刷新缓冲区，确保数据被写入文件

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
