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
            Path servicePath = Paths.get(servicePackagePath.toString()+ "/"+tableInfo.getServiceName()+ Constants.JAVA_FILE_SUFFIX);
            Path serviceImplPath = Paths.get(servicePackagePath.toString()+ "/impl/"+tableInfo.getServiceImplName()+ Constants.JAVA_FILE_SUFFIX);
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
                ImportPackage.import4Service(bw,tableInfo);
                bw.newLine();
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment());
                bw.write(("public interface "+tableInfo.getServiceName()+"{"));
                bw.newLine();
                bw.newLine();

                /* 新增方法 */
                CommentsBuilder.getComment4Methods(bw,"新增");//新增方法注解
                bw.write("\tpublic Object insert"+" ("+tableInfo.getBeanName() +" "+tableInfo.getObjectName()+");");
                bw.newLine();
                bw.newLine();
                /* 根据id删除 */
                CommentsBuilder.getComment4Methods(bw,"根据id删除");
                bw.write("\tpublic Object deleteById"+" ( Long id );");
                bw.newLine();
                bw.newLine();
                /* 根据id查找 */
                CommentsBuilder.getComment4Methods(bw,"根据id查找");
                bw.write("\tpublic Object getById"+" ( Long id );");
                bw.newLine();
                bw.newLine();
                /* 查找列表 */
                CommentsBuilder.getComment4Methods(bw,"查找列表");
                bw.write("\tpublic Object getList"+" ();");
                bw.newLine();
                bw.newLine();
                /* 根据id修改 */
                CommentsBuilder.getComment4Methods(bw,"根据id修改");
                bw.write("\tpublic Object updateById"+" ( Long id );");
                bw.newLine();
                bw.newLine();
                bw.write("}");
                bw.flush(); // 刷新缓冲区，确保数据被写入文件


                /** 写入service impl实现类文件 */
                writer = new FileWriter(serviceImplPath.toString(),false);
                bw = new BufferedWriter(writer);
                bw.write(("package "+Constants.SERVICE_PACKAGE)+".impl;");
                bw.newLine();
                ImportPackage.import4ServiceImpl(bw,tableInfo);
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment());
                bw.write(("public class "+tableInfo.getServiceImplName()+" implements "+tableInfo.getServiceName()+"{"));
                bw.newLine();
                bw.write("\t@Autowired");
                bw.newLine();
                String mapperObjectName=tableInfo.getObjectName()+"Mapper";  //对应mapper名称
                bw.write("\tprivate "+tableInfo.getMapperName()+" "+mapperObjectName+";");
                bw.newLine();
                bw.newLine();
                /* 新增方法 */
                CommentsBuilder.getComment4Methods(bw,"新增");//新增方法注解
                bw.write("\t@Override");
                bw.newLine();
                bw.write("\tpublic Object insert"+" ("+tableInfo.getBeanName() +" "+tableInfo.getObjectName()+"){");
                bw.newLine();
                bw.write("\t\t"+mapperObjectName+"."+"insert( "+tableInfo.getObjectName()+");");//调用mapper方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.newLine();
                /* 根据id删除 */
                CommentsBuilder.getComment4Methods(bw,"根据id删除");
                bw.write("\t@Override");
                bw.newLine();
                bw.write("\tpublic Object deleteById"+" ( Long id ){");
                bw.newLine();
                bw.write("\t\t"+mapperObjectName+"."+"deleteById( id );");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.newLine();
                /* 根据id查找 */
                CommentsBuilder.getComment4Methods(bw,"根据id查找");
                bw.write("\t@Override");
                bw.newLine();
                bw.write("\tpublic Object getById"+" ( Long id ){");
                bw.newLine();
                bw.write("\t\t"+mapperObjectName+"."+"getById( id );");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.newLine();
                /* 查找列表 */
                CommentsBuilder.getComment4Methods(bw,"查找列表");
                bw.write("\t@Override");
                bw.newLine();
                bw.write("\tpublic Object getList"+" (){");
                bw.newLine();
                bw.write("\t\t"+mapperObjectName+"."+"getList();");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.newLine();
                /* 根据id修改 */
                CommentsBuilder.getComment4Methods(bw,"根据id修改");
                bw.write("\t@Override");
                bw.newLine();
                bw.write("\tpublic Object updateById"+" (Long id ){");
                bw.newLine();
                bw.write("\t\t"+mapperObjectName+"."+"getById( id );");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.write("}");
                bw.flush(); // 刷新缓冲区，确保数据被写入文件
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
