package org.lycoding.fastcode.builder;

import org.lycoding.fastcode.bean.Constants;
import org.lycoding.fastcode.bean.TableInfo;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * describe 引入注解
 * @Author: lycoding
 * @DateTime: 2024/12/10 22:42
 **/
public class ImportPackage {
    /** 创建controller类需要包 */
    public static void import4Controller(BufferedWriter bw, TableInfo tableInfo) throws IOException {
        bw.write("import org.springframework.beans.factory.annotation.Autowired;\n" +
          "import org.springframework.web.bind.annotation.*;\n"+
          "import "+Constants.SERVICE_PACKAGE+"."+tableInfo.getServiceName()+";\n"+
          "import "+Constants.PO_PACKAGE+"."+tableInfo.getBeanName()+";\n");
    }

    /** 创建serviceImpl所需要的包 */
    public static void import4ServiceImpl(BufferedWriter bw, TableInfo tableInfo) throws IOException {
        bw.write("import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import "+Constants.SERVICE_PACKAGE+"."+tableInfo.getServiceName()+";\n"+
                "import "+Constants.MAPPER_PACKAGE+"."+tableInfo.getMapperName()+";\n"+
                "import "+Constants.PO_PACKAGE+"."+tableInfo.getBeanName()+";\n");
    }

    /** 创建service所需要的包 */
    public static void import4Service(BufferedWriter bw, TableInfo tableInfo) throws IOException {
        bw.write("import "+Constants.PO_PACKAGE+"."+tableInfo.getBeanName()+";\n");
    }
    /** 创建service所需要的包 */
    public static void import4Mapper(BufferedWriter bw, TableInfo tableInfo) throws IOException {
        bw.write("import "+Constants.PO_PACKAGE+"."+tableInfo.getBeanName()+";\n");
    }
}
