package org.lycoding.fastcode.builder;

import cn.hutool.json.JSONUtil;
import org.lycoding.fastcode.bean.Constants;
import org.lycoding.fastcode.bean.FieldInfo;
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

public class GenerateMapper {
    private static final Logger logger= LoggerFactory.getLogger(GenerateMapper.class);
    public static void execute() throws IOException, SQLException {
//        java文件基本路径（肯定存在）
        final String MAPPER_PATH= Constants.BASE_PATH+Constants.JAVA_PATH+Constants.PACKAGE_PATH+Constants.SOURCE_MAPPER.replace(".","/");
        Path mapperPackagePath= Paths.get(MAPPER_PATH);

//        判断基本包路径是否存在，否则创建
        if (!(Files.exists(mapperPackagePath)&&Files.isDirectory(mapperPackagePath))){
            Files.createDirectories(mapperPackagePath);
        }

//       判断mapper包路径是否存在，否则创建
        if (!(Files.exists(mapperPackagePath)&&Files.isDirectory(mapperPackagePath))){
            Files.createDirectories(mapperPackagePath);
        }

//       创建Mapper类
        List<TableInfo> tableList = TableBuilder.getTableList();
        if (tableList.isEmpty()){
            logger.warn("表内容为空！！");
            return;
        }

        for (TableInfo tableInfo : tableList) {
            Path beanPath = Paths.get(mapperPackagePath.toString()+ "/"+tableInfo.getBeanName()+"Mapper" + Constants.JAVA_FILE_SUFFIX);
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
                bw.write(("package "+Constants.MAPPER_PACKAGE)+";");
                bw.newLine();
                bw.newLine();
                CommentsBuilder.getComment4Class(bw,tableInfo.getTableComment(),Constants.AUTHOR);
                bw.write(("public interface "+tableInfo.getBeanName()+"Mapper {"));
                bw.newLine();
                bw.write("\n}");

                bw.flush(); // 刷新缓冲区，确保数据被写入文件

            }catch (Exception e){
                e.printStackTrace();
            }
        }
//        logger.info("{}", JSONUtil.toJsonPrettyStr(tableList));
    }
}
