package org.lycoding.fastcode;

import cn.hutool.json.JSONUtil;
import org.lycoding.fastcode.bean.TableInfo;
import org.lycoding.fastcode.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class RunApplication {
    private static final Logger logger= LoggerFactory.getLogger(RunApplication.class);
    public static void main(String[] args) throws SQLException, IOException {

//       创建Mapper类
        List<TableInfo> tableList = TableBuilder.getTableList();
        if (tableList.isEmpty()){
            logger.warn("表内容为空！！");
            return;
        }
        /** 控制台输出json格式的表数据 */
//        logger.info("{}", JSONUtil.toJsonPrettyStr(tableList));
        GenerateMapper.execute(tableList);
        GenerateService.execute(tableList);
        GenerateController.execute(tableList);
        GeneratePo.execute(tableList);
        GenerateXml.execute(tableList);
    }
}
