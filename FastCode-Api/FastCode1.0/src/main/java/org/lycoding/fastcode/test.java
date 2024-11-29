package org.lycoding.fastcode;

import cn.hutool.json.JSONUtil;
import org.lycoding.fastcode.bean.FieldInfo;
import org.lycoding.fastcode.bean.TableInfo;
import org.lycoding.fastcode.builder.TableBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.List;

public class test {
    public static final Logger logger = LoggerFactory.getLogger(test.class);
    public static void main(String[] args) throws SQLException {
        List<TableInfo> tableList = TableBuilder.getTableList();
        logger.info("{}", JSONUtil.toJsonPrettyStr(tableList));

        for (TableInfo tableInfo : tableList) {
            for (FieldInfo fieldInfo : tableInfo.getFieldInfoList()) {
                System.out.println(fieldInfo.getPropertyName());
            }
        }

    }
}
