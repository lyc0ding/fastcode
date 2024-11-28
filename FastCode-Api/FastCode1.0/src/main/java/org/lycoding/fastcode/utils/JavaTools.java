package org.lycoding.fastcode.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.lycoding.fastcode.bean.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据库字段、表名转换成java所需要的类型
 */
public class JavaTools {
    private static final Logger log = LoggerFactory.getLogger(JavaTools.class);

    /** 规范化beanName */
    public static String tableNameToBeanName(String tableName,boolean ignoreTablePrefix,boolean upCaseFiledName) {
        if (!(tableName.length()>0)){
            log.warn("请输入正确的字符串");
            return null;
        }
        StringBuffer buffer = new StringBuffer();

//        忽略表前缀
        if(ignoreTablePrefix){
            for (int i = 0; i < tableName.length(); i++) {
                if (tableName.charAt(i)=='_'){
                    for(int j=i+1;j<tableName.length();j++){
                        buffer.append(tableName.charAt(j));
                    }
                    break;
                }
            }
            buffer.append(tableName);
        }else {
            buffer.append(tableName);
        }

//        首字符大写
        if (upCaseFiledName){
            buffer.replace(0,1,Character.toString(Character.toUpperCase(buffer.charAt(0))));
        }
        return convertUnderscoreToCamelCase(buffer.toString());
    }

    /** 将下划线后第一个字符大写，并去掉下划线 */
    public static String convertUnderscoreToCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            return str; // 处理空字符串
        }

        StringBuilder result = new StringBuilder();
        String[] parts = str.split("_"); // 以下划线分割字符串


        for (String part : parts) {
            if (result.length() == 0) {
                result.append(part); // 第一个单词小写
            } else {
                // 将下划线后第一个字母转为大写并添加
                result.append(part.substring(0, 1).toUpperCase());
                // 添加后面的部分
                result.append(part.substring(1));
            }
        }
        return result.toString();
    }


    /**  mysql数据类型转换成java数据类型  */
    public static String convertJavaType(String sourceType){
        if(ArrayUtils.contains(Constants.SQL_INTEGER_TYPE,sourceType)){
            return "Integer";
        }
        else if(ArrayUtils.contains(Constants.SQL_LONG_TYPE,sourceType)){
            return "Long";
        }
        else if (ArrayUtils.contains(Constants.SQL_BIG_DECIMAL_TYPE,sourceType)){
            return "BigDecimal";
        }
        else if(ArrayUtils.contains(Constants.SQL_DATE_TIME_TYPE,sourceType)||ArrayUtils.contains(Constants.SQL_DATE_TYPE,sourceType)){
            return "Date";
        }
        else{
            return "String";
        }
    }

//    判断该字段是否自增
    public static Boolean convertIsAutoIncrement(String extra){
        if (StringUtils.equalsIgnoreCase(extra,"auto_increment")){
            return true;
        }
        return false;
    }

//    处理包名


}
