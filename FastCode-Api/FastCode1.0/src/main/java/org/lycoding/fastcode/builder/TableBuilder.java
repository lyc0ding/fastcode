package org.lycoding.fastcode.builder;

import org.lycoding.fastcode.bean.Constants;
import org.lycoding.fastcode.bean.FieldInfo;
import org.lycoding.fastcode.bean.TableInfo;
import org.lycoding.fastcode.utils.PropertiesUtils;
import org.lycoding.fastcode.utils.JavaTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 日志工具输出用的是sl4j包
 */
public class TableBuilder {
    private static Connection connection=null;
    private static final Logger logger = LoggerFactory.getLogger(TableBuilder.class);

    private static final String GET_TABLE_INFO="show table status";//获取数据库所有表信息
    private static final String GET_TABLE_FIELDS="show full fields from "; //获取某个表所有字段信息
    private static final String GET_TABLE_KEY_INDEX="show index from "; //获取某个表所有字段信息

    static {
        String driver= PropertiesUtils.getValue("db.driverName");
        String url= PropertiesUtils.getValue("db.url");
        String user= PropertiesUtils.getValue("db.username");
        String password= PropertiesUtils.getValue("db.password");
        try {
            Class.forName(driver);
            connection= DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            logger.warn("数据库连接失败");
        }
    }

//    获取数据库中所有表信息
    public static List<TableInfo> getTableList() throws SQLException {
        PreparedStatement ps=null;
        ResultSet rs=null;

        List<TableInfo> tableInfoList = new ArrayList();

        try {
            ps = connection.prepareStatement(GET_TABLE_INFO);
            rs=ps.executeQuery();

            while (rs.next()){
//                解析表信息，添加到列表
                String tableName=rs.getString("name");
                String tableComment=rs.getString("comment");

                String beanName=tableName;

//                忽略表名前缀：tb_ 、 sys_ ……
                beanName=JavaTools.tableNameToBeanName(tableName, false,Constants.UPCASE_FIRST_LETTER);

                TableInfo tableInfo = new TableInfo();
                tableInfo.setTableName(tableName);
                tableInfo.setTableComment(tableComment);
                tableInfo.setBeanName(beanName);
                tableInfo.setObjectName(JavaTools.convertUnderscoreToCamelCase(tableName));

                logger.info("正在获取 {} 表所有字段信息：",tableName);
                tableInfo.setFieldInfoList(getFieldList(tableName,tableInfo));
                tableInfoList.add(tableInfo);
            }
        } catch (Exception e) {
            new RuntimeException("获取表失败");
        }
        finally {
            if (rs!=null){
                rs.close();
            }
            if (ps!=null){
                ps.close();
            }
            if (connection!=null){
                connection.close();
            }
            return tableInfoList;
        }
    }

//    获取表中所有字段信息
    public static List<FieldInfo> getFieldList(String tableName,TableInfo tableInfo) throws SQLException {
        PreparedStatement ps=null;
        ResultSet rs=null;

        List<FieldInfo> fieldInfoList = new ArrayList<>();

        try{
            ps=connection.prepareStatement(GET_TABLE_FIELDS+tableName);
            rs=ps.executeQuery();

            while(rs.next()){
                FieldInfo fieldInfo = new FieldInfo();
                String fieldName=rs.getString("Field");//字段名
                String fieldType =rs.getString("Type");//mysql类型
                String fieldKey=rs.getString("Key");//键类型
                String fieldExtra=rs.getString("Extra");//是否自增  是：auto_increment
                String fieldComment=rs.getString("Comment");//字段注释

                fieldInfo.setFieldName(fieldName);
                fieldInfo.setPropertyName(JavaTools.convertUnderscoreToCamelCase(fieldName));
                fieldInfo.setFieldType(JavaTools.convertJavaType(fieldType));
                if (JavaTools.convertJavaType(fieldType).equals("String")) {
                    fieldInfo.setSqlType("varchar");
                } else {
                    fieldInfo.setSqlType(fieldType);
                }
//               设置表数据存在日期、bigdecimal存在为true
                if (JavaTools.convertJavaType(fieldType).equals("Date")) {
                    tableInfo.setExistDate(true);
                }
                else if (JavaTools.convertJavaType(fieldType).equals("BigDecimal")){
                    tableInfo.setBigDecimal(true);
                }
                fieldInfo.setFieldComment(fieldComment);
                fieldInfo.setAutoIncrement(JavaTools.convertIsAutoIncrement(fieldExtra));

//                logger.info("{}", JSONUtil.toJsonPrettyStr(fieldInfo));
                fieldInfoList.add(fieldInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            logger.info("表字段信息获取完成……");
            if (rs!=null){
                rs.close();
            }
            if (ps!=null){
                ps.close();
            }
            return fieldInfoList;
        }
    }

    public static void getKeyIndexInfo(String tableName){
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            ps=connection.prepareStatement(GET_TABLE_KEY_INDEX+tableName);
            rs= ps.executeQuery();

            while (rs.next()) {
                String indexType=rs.getString("Non_unique");
                String columnName=rs.getString("column_name");
                String keyName = rs.getString("Key_name");
            }
        } catch (Exception e) {
        }
    }
}
