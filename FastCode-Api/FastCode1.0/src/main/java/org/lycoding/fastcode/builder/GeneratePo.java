package org.lycoding.fastcode.builder;

import cn.hutool.json.JSONUtil;
import org.lycoding.fastcode.bean.Constants;
import org.lycoding.fastcode.bean.FieldInfo;
import org.lycoding.fastcode.bean.TableInfo;
import org.lycoding.fastcode.utils.JavaTools;
import org.lycoding.fastcode.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

public class GeneratePo {
    private static final Logger logger= LoggerFactory.getLogger(GeneratePo.class);
    public static void execute() throws IOException, SQLException {
//        java文件基本路径（肯定存在）
        final String PO_PATH=Constants.BASE_PATH+Constants.JAVA_PATH+Constants.PACKAGE_PATH+Constants.SOURCE_PO.replace(".","/");
        Path poPackagePath= Paths.get(PO_PATH);

//        判断基本包路径是否存在，否则创建
        if (!(Files.exists(poPackagePath)&&Files.isDirectory(poPackagePath))){
            Files.createDirectories(poPackagePath);
        }
//       判断po包路径是否存在，否则创建
        if (!(Files.exists(poPackagePath)&&Files.isDirectory(poPackagePath))){
            Files.createDirectories(poPackagePath);
        }

//       创建pojo类
        List<TableInfo> tableList = TableBuilder.getTableList();
        if (tableList.isEmpty()){
            logger.warn("表内容为空！！");
            return;
        }

        for (TableInfo tableInfo : tableList) {
            Path beanPath = Paths.get(poPackagePath.toString()+ "/"+tableInfo.getBeanName() + Constants.JAVA_FILE_SUFFIX);
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
                bw.write(("package "+Constants.PO_PACKAGE)+";");
                bw.newLine();
                bw.newLine();
                bw.write(("import java.sql.Date;"));
                bw.newLine();
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment(),Constants.AUTHOR);
                bw.write(("public class "+tableInfo.getBeanName()+"{"));

                // 循环写入pojo类的属性
                for (FieldInfo fieldInfo : tableInfo.getFieldInfoList()) {
                    CommentsBuilder.getComment4Property(bw, fieldInfo.getFieldComment());//注释
                    bw.write(("\t"+"private "+fieldInfo.getFieldType()+" "+fieldInfo.getPropertyName()+";"));//属性
                    bw.newLine();
                }
                CommentsBuilder.getComment4Property(bw,"setter、getter方法");
                //getter、setter方法
                for (FieldInfo fieldInfo : tableInfo.getFieldInfoList()) {
                    bw.write("\t"+"public void set"+ StringUtils.upCaseFirstLetter(fieldInfo.getPropertyName())+"(");
                    bw.write(fieldInfo.getFieldType()+" "+fieldInfo.getPropertyName()+"){");
                    bw.newLine();
                    bw.write("\t\tthis."+fieldInfo.getPropertyName()+"="+fieldInfo.getPropertyName()+";");
                    bw.newLine();
                    bw.write("\t"+"}");
                    bw.newLine();

                    bw.write("\t"+"public "+fieldInfo.getFieldType()+" get"+ StringUtils.upCaseFirstLetter(fieldInfo.getPropertyName())+"(){");
                    bw.newLine();
                    bw.write("\t\treturn this."+fieldInfo.getPropertyName()+";");
                    bw.newLine();
                    bw.write("\t"+"}");
                    bw.newLine();
                }


                bw.write("\n}");

                bw.flush(); // 刷新缓冲区，确保数据被写入文件

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        logger.info("{}", JSONUtil.toJsonPrettyStr(tableList));
    }

}
