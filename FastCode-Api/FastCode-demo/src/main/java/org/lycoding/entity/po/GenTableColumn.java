package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 代码生成业务表字段
*
* @author Tom
* @date 2024-12-16
**/
public class GenTableColumn{
	/** 编号 */
	private String columnId;

	/** 归属表编号 */
	private String tableId;

	/** 列名称 */
	private String columnName;

	/** 列描述 */
	private String columnComment;

	/** 列类型 */
	private String columnType;

	/** JAVA类型 */
	private String javaType;

	/** JAVA字段名 */
	private String javaField;

	/** 是否主键（1是） */
	private String isPk;

	/** 是否自增（1是） */
	private String isIncrement;

	/** 是否必填（1是） */
	private String isRequired;

	/** 是否为插入字段（1是） */
	private String isInsert;

	/** 是否编辑字段（1是） */
	private String isEdit;

	/** 是否列表字段（1是） */
	private String isList;

	/** 是否查询字段（1是） */
	private String isQuery;

	/** 查询方式（等于、不等于、大于、小于、范围） */
	private String queryType;

	/** 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件） */
	private String htmlType;

	/** 字典类型 */
	private String dictType;

	/** 排序 */
	private String sort;

	/** 创建者 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新者 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** setter、getter方法 */
	public void setColumnId(String columnId){
		this.columnId=columnId;
	}
	public String getColumnId(){
		return this.columnId;
	}
	public void setTableId(String tableId){
		this.tableId=tableId;
	}
	public String getTableId(){
		return this.tableId;
	}
	public void setColumnName(String columnName){
		this.columnName=columnName;
	}
	public String getColumnName(){
		return this.columnName;
	}
	public void setColumnComment(String columnComment){
		this.columnComment=columnComment;
	}
	public String getColumnComment(){
		return this.columnComment;
	}
	public void setColumnType(String columnType){
		this.columnType=columnType;
	}
	public String getColumnType(){
		return this.columnType;
	}
	public void setJavaType(String javaType){
		this.javaType=javaType;
	}
	public String getJavaType(){
		return this.javaType;
	}
	public void setJavaField(String javaField){
		this.javaField=javaField;
	}
	public String getJavaField(){
		return this.javaField;
	}
	public void setIsPk(String isPk){
		this.isPk=isPk;
	}
	public String getIsPk(){
		return this.isPk;
	}
	public void setIsIncrement(String isIncrement){
		this.isIncrement=isIncrement;
	}
	public String getIsIncrement(){
		return this.isIncrement;
	}
	public void setIsRequired(String isRequired){
		this.isRequired=isRequired;
	}
	public String getIsRequired(){
		return this.isRequired;
	}
	public void setIsInsert(String isInsert){
		this.isInsert=isInsert;
	}
	public String getIsInsert(){
		return this.isInsert;
	}
	public void setIsEdit(String isEdit){
		this.isEdit=isEdit;
	}
	public String getIsEdit(){
		return this.isEdit;
	}
	public void setIsList(String isList){
		this.isList=isList;
	}
	public String getIsList(){
		return this.isList;
	}
	public void setIsQuery(String isQuery){
		this.isQuery=isQuery;
	}
	public String getIsQuery(){
		return this.isQuery;
	}
	public void setQueryType(String queryType){
		this.queryType=queryType;
	}
	public String getQueryType(){
		return this.queryType;
	}
	public void setHtmlType(String htmlType){
		this.htmlType=htmlType;
	}
	public String getHtmlType(){
		return this.htmlType;
	}
	public void setDictType(String dictType){
		this.dictType=dictType;
	}
	public String getDictType(){
		return this.dictType;
	}
	public void setSort(String sort){
		this.sort=sort;
	}
	public String getSort(){
		return this.sort;
	}
	public void setCreateBy(String createBy){
		this.createBy=createBy;
	}
	public String getCreateBy(){
		return this.createBy;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateBy(String updateBy){
		this.updateBy=updateBy;
	}
	public String getUpdateBy(){
		return this.updateBy;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}

}