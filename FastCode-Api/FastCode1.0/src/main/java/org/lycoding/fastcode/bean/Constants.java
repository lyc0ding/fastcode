package org.lycoding.fastcode.bean;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.lycoding.fastcode.utils.PropertiesUtils;

public class Constants {
    public static Boolean IGNORE_TABLE_PREFIX;
    public static Boolean UPCASE_FIRST_LETTER;

    public static final String JAVA_FILE_SUFFIX=".java";
    public static final String MYBATIS_FILE_SUFFIX=".xml";

    public static final String JAVA_PATH="java/";
    public static final String RESOURCE_PATH="resource/";

    public static String BASE_PATH;
    public static String PACKAGE_PATH;
    public static String PO_PATH;

    static {
//        初始化配置文件规则
        IGNORE_TABLE_PREFIX= Boolean.valueOf(PropertiesUtils.getValue("ignore.table.prefix"));
        UPCASE_FIRST_LETTER= Boolean.valueOf(PropertiesUtils.getValue("upcase.table.first.letter"));

//        初始化包路径
        BASE_PATH=PropertiesUtils.getValue("base.path");
        PACKAGE_PATH=PropertiesUtils.getValue("package.path");
        PO_PATH=PropertiesUtils.getValue("package.po");
    }

    public static final String[] SQL_DATE_TIME_TYPE=new String[]{"datetime","timestamp"};
    public static final String[] SQL_DATE_TYPE=new String[]{"date"};
    public static final String[] SQL_BIG_DECIMAL_TYPE=new String[]{"decimal","double","float"};
    public static final String[] SQL_STRING_TYPE=new String[]{"char","varchar","text","mediumtext","longtext"};
    public static final String[] SQL_INTEGER_TYPE=new String[]{"int","tinyint"};
    public static final String[] SQL_LONG_TYPE=new String[]{"bigint"};

}
