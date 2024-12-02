package org.lycoding.fastcode.utils;

import java.nio.charset.StandardCharsets;

public class StringUtils {
    /** 字符串首字母大写 */
    public static String upCaseFirstLetter(String value){
        StringBuffer buffer = new StringBuffer(value);
        buffer.setCharAt(0,Character.toUpperCase(buffer.charAt(0)));
        return buffer.toString();
    }

}
