package org.lycoding.fastcode.builder;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

/**
 * 构建生成代码中的注释
 */
public class CommentsBuilder {
    /** po类中的注释 */
    public static void getComment4Class(BufferedWriter bw,String description,String author) throws IOException {
        bw.write("/**");
        bw.newLine();
        bw.write(" * Description:"+description);
        bw.newLine();
        bw.write(" *");
        bw.newLine();
        bw.write(" * @author:"+author);
        bw.newLine();
        bw.write(" * "+String.valueOf(new Date()));
        bw.newLine();
        bw.write("*/");
        bw.newLine();
    }

    /** 属性注释*/
    public static void getComment4Property(BufferedWriter bw,String comment) throws IOException {
        bw.newLine();
        bw.write("\t");
        bw.write("/** "+comment+" */");
        bw.newLine();
    }
}
