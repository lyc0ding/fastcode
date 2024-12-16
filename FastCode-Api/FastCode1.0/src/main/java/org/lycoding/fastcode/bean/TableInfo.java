package org.lycoding.fastcode.bean;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据库所有表信息
 */
public class TableInfo {
    /**
     * 表名
     */
    private String tableName;
    /**
     * beanName
     */
    private String beanName;
    /**
     * objectName
     */
    private String objectName;
    /**
     * 表注释
     */
    private String tableComment;
    /**
     * 表参数:实体类
     */
    private String beanParamName;
    /**
     * 字段信息
     */
    private List<FieldInfo> fieldInfoList;
    /**
     * 唯一索引集合
     */
    private Map<String,List<FieldInfo>> keyIndexInfo = new LinkedHashMap<>();
    /**
     * 是否有date类型
     */
    private boolean isExistDate;
    /**
     * 是否有dateTime类型
     */
    private boolean isExistDateTime;
    /**
     * 是否有bigDecimal类型
     */
    private boolean isBigDecimal;

    /**
     * controller类名
     * @return
     */
    private String controllerName;
    /**
     * service接口名
     * @return
     */
    private String serviceName;
    /**
     * service实现类名
     * @return
     */
    private String serviceImplName;
    /**
     * mapper接口名
     * @return
     */
    private String mapperName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public String getBeanParamName() {
        return beanParamName;
    }

    public void setBeanParamName(String beanParamName) {
        this.beanParamName = beanParamName;
    }

    public List<FieldInfo> getFieldInfoList() {
        return fieldInfoList;
    }

    public void setFieldInfoList(List<FieldInfo> fieldInfoList) {
        this.fieldInfoList = fieldInfoList;
    }

    public Map<String, List<FieldInfo>> getKeyIndexInfo() {
        return keyIndexInfo;
    }

    public void setKeyIndexInfo(Map<String, List<FieldInfo>> keyIndexInfo) {
        this.keyIndexInfo = keyIndexInfo;
    }

    public boolean isExistDate() {
        return isExistDate;
    }

    public void setExistDate(boolean existDate) {
        isExistDate = existDate;
    }

    public boolean isExistDateTime() {
        return isExistDateTime;
    }

    public void setExistDateTime(boolean existDateTime) {
        isExistDateTime = existDateTime;
    }

    public boolean isBigDecimal() {
        return isBigDecimal;
    }

    public void setBigDecimal(boolean bigDecimal) {
        isBigDecimal = bigDecimal;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceImplName() {
        return serviceImplName;
    }

    public void setServiceImplName(String serviceImplName) {
        this.serviceImplName = serviceImplName;
    }

    public String getMapperName() {
        return mapperName;
    }

    public void setMapperName(String mapperName) {
        this.mapperName = mapperName;
    }

    @Override
    public String toString() {
        return "TableInfo{" +
                "tableName='" + tableName + '\'' +
                ", beanName='" + beanName + '\'' +
                ", tableComment='" + tableComment + '\'' +
                ", beanParamName='" + beanParamName + '\'' +
                ", fieldInfoList=" + fieldInfoList +
                ", keyIndexInfo=" + keyIndexInfo +
                ", isExistDate=" + isExistDate +
                ", isExistDateTime=" + isExistDateTime +
                ", isBigDecimal=" + isBigDecimal +
                '}';
    }
}
