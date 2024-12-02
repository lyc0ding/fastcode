package org.lycoding.fastcode;

import org.lycoding.fastcode.builder.GeneratePo;
import org.lycoding.fastcode.builder.GenerateXml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.sql.SQLException;

public class RunApplication {
    private static final Logger logger= LoggerFactory.getLogger(RunApplication.class);
    public static void main(String[] args) throws SQLException, IOException {
        GeneratePo.execute();
//        GenerateXml.execute();
    }
}
