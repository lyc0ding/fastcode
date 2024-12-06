package org.lycoding.fastcode.builder;

import org.lycoding.fastcode.bean.Constants;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

/**
 * 构建生成代码中的注释
 */
public class CommentsBuilder {
    /** po类中的注释 */
    public static void getComment4Class(BufferedWriter bw,String description) throws IOException {
        bw.write("/**");
        bw.newLine();
        bw.write("* @description "+description);
        bw.newLine();
        bw.write("*");
        bw.newLine();
        bw.write("* @author "+ Constants.AUTHOR);
        bw.newLine();
        bw.write("* @date "+ LocalDate.now());
        bw.newLine();
        bw.write("**/");
        bw.newLine();
    }

    /** 属性注释*/
    public static void getComment4Property(BufferedWriter bw,String comment) throws IOException {
        bw.newLine();
        bw.write("\t");
        bw.write("/** "+comment+" */");
        bw.newLine();
    }

    /**
     * 方法注释
     */
    public static void getComment4Methods(BufferedWriter bw,String comment) throws IOException {
        bw.write("\t/**");
        bw.newLine();
        bw.write("\t* @description " + comment);
        bw.newLine();
        bw.write("\t* @author " + Constants.AUTHOR);
        bw.newLine();
        bw.write("\t* @date " + LocalDate.now());
        bw.newLine();
        bw.write("\t**/");
        bw.newLine();
    }
}
