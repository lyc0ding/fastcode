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
            Path beanPath = Paths.get(controllerPackagePath.toString()+ "/"+tableInfo.getControllerName() + Constants.JAVA_FILE_SUFFIX);
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
                bw.write(("package "+Constants.CONTROLLER_PACKAGE)+";");//包名
                bw.newLine();
                bw.newLine();
                ImportPackage.import4Controller(bw,tableInfo);//插入注解
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment());//类注释
                bw.write("@RestController");//不找视图
                bw.newLine();
                bw.write("@RequestMapping(value = \"/"+tableInfo.getObjectName()+"\")");
                bw.newLine();
                bw.write(("public class "+tableInfo.getControllerName()+"{"));
                bw.newLine();
                bw.write("\t@Autowired");
                bw.newLine();
                String serviceObjectName=tableInfo.getObjectName()+"Service";  //对应sevice名称
                bw.write("\tprivate "+tableInfo.getServiceName()+" "+serviceObjectName+";");
                bw.newLine();
                /* 新增方法 */
                CommentsBuilder.getComment4Methods(bw,"新增");//新增方法注解
                bw.write("\t@PostMapping( \"/\" )");
                bw.newLine();
                bw.write("\tpublic Object insert"+" ("+tableInfo.getBeanName() +" "+tableInfo.getObjectName()+"){");
                bw.newLine();
                bw.write("\t\t"+serviceObjectName+"."+"insert( "+tableInfo.getObjectName()+");");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.newLine();
                /* 根据id删除 */
                CommentsBuilder.getComment4Methods(bw,"根据id删除");
                bw.write("\t@DeleteMapping( \"/{id}\" )");
                bw.newLine();
                bw.write("\tpublic Object deleteById"+" ( @PathVariable Long id ){");
                bw.newLine();
                bw.write("\t\t"+serviceObjectName+"."+"deleteById( id );");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.newLine();
                /* 根据id查找 */
                CommentsBuilder.getComment4Methods(bw,"根据id查找");
                bw.write("\t@GetMapping( \"/{id}\" )");
                bw.newLine();
                bw.write("\tpublic Object getById"+" ( @PathVariable Long id ){");
                bw.newLine();
                bw.write("\t\t"+serviceObjectName+"."+"getById( id );");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.newLine();
                /* 查找列表 */
                CommentsBuilder.getComment4Methods(bw,"查找列表");
                bw.write("\t@GetMapping( \"/list\" )");
                bw.newLine();
                bw.write("\tpublic Object getList"+" (){");
                bw.newLine();
                bw.write("\t\t"+serviceObjectName+"."+"getList();");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                /* 根据id修改 */
                CommentsBuilder.getComment4Methods(bw,"根据id修改");
                bw.write("\t@PutMapping( \"/{id}\" )");
                bw.newLine();
                bw.write("\tpublic Object updateById"+" ( @PathVariable Long id ){");
                bw.newLine();
                bw.write("\t\t"+serviceObjectName+"."+"getById( id );");//调用service方法
                bw.newLine();
                bw.write("\t\treturn null;");
                bw.newLine();
                bw.write("\t}");
                bw.newLine();
                bw.write("\n}");
                bw.flush(); // 刷新缓冲区，确保数据被写入文件

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
