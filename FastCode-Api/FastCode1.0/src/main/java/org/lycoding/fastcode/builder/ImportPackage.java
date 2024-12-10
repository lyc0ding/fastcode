package org.lycoding.fastcode.builder;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * describe 引入注解
 * @Author: lycoding
 * @DateTime: 2024/12/10 22:42
 **/
public class ImportPackage {
    /** controller注解 */
    public static void import4Controller(BufferedWriter bw) throws IOException {
        bw.write("import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "import org.springframework.web.bind.annotation.RestController;");
    }

}
