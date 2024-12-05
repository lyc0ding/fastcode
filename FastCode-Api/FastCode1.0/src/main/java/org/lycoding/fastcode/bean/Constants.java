package org.lycoding.fastcode.bean;

import org.lycoding.fastcode.utils.PropertiesUtils;

public class Constants {
    public static Boolean IGNORE_TABLE_PREFIX;
    public static Boolean UPCASE_FIRST_LETTER;
//    基本文件后缀
    public static final String JAVA_FILE_SUFFIX=".java";
    public static final String MYBATIS_FILE_SUFFIX=".xml";
//  基本包
    public static final String JAVA_PATH="java/";
    public static final String RESOURCE_PATH="resources/";

    public static String BASE_PATH;
    public static String PACKAGE_PATH;

    public static String SOURCE_PO;
    public static String SOURCE_MAPPER;
    public static String SOURCE_SERVICE;

    public static String PO_PACKAGE;
    public static String MAPPER_PACKAGE;
    public static String SERVICE_PACKAGE;
    public static String AUTHOR = null;

    static {
//        初始化配置文件规则
        IGNORE_TABLE_PREFIX= Boolean.valueOf(PropertiesUtils.getValue("ignore.table.prefix"));
        UPCASE_FIRST_LETTER= Boolean.valueOf(PropertiesUtils.getValue("upcase.table.first.letter"));

//        初始化包路径
        BASE_PATH=PropertiesUtils.getValue("base.path");
        PACKAGE_PATH = PropertiesUtils.getValue("package.path");
        SOURCE_PO=PropertiesUtils.getValue("package.po");
        SOURCE_MAPPER=PropertiesUtils.getValue("package.mapper");
        SOURCE_SERVICE=PropertiesUtils.getValue("package.service");
//        相对路径包
        PO_PACKAGE = PACKAGE_PATH.replace("/",".")+SOURCE_PO;
        MAPPER_PACKAGE = PACKAGE_PATH.replace("/",".")+SOURCE_MAPPER;
        SERVICE_PACKAGE = PACKAGE_PATH.replace("/",".")+SOURCE_SERVICE;
        AUTHOR= PropertiesUtils.getValue("author");
    }

    public static final String[] SQL_DATE_TIME_TYPE=new String[]{"datetime","timestamp"};
    public static final String[] SQL_DATE_TYPE=new String[]{"date"};
    public static final String[] SQL_BIG_DECIMAL_TYPE=new String[]{"decimal","double","float"};
    public static final String[] SQL_STRING_TYPE=new String[]{"char","varchar","text","mediumtext","longtext"};
    public static final String[] SQL_INTEGER_TYPE=new String[]{"int","tinyint"};
    public static final String[] SQL_LONG_TYPE=new String[]{"bigint"};


}
