package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 代码生成业务表
*
* @author Tom
* @date 2024-12-16
**/
public class GenTable{
	/** 编号 */
	private String tableId;

	/** 表名称 */
	private String tableName;

	/** 表描述 */
	private String tableComment;

	/** 关联子表的表名 */
	private String subTableName;

	/** 子表关联的外键名 */
	private String subTableFkName;

	/** 实体类名称 */
	private String className;

	/** 使用的模板（crud单表操作 tree树表操作） */
	private String tplCategory;

	/** 生成包路径 */
	private String packageName;

	/** 生成模块名 */
	private String moduleName;

	/** 生成业务名 */
	private String businessName;

	/** 生成功能名 */
	private String functionName;

	/** 生成功能作者 */
	private String functionAuthor;

	/** 生成代码方式（0zip压缩包 1自定义路径） */
	private String genType;

	/** 生成路径（不填默认项目路径） */
	private String genPath;

	/** 其它生成选项 */
	private String options;

	/** 创建者 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新者 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** 备注 */
	private String remark;

	/** setter、getter方法 */
	public void setTableId(String tableId){
		this.tableId=tableId;
	}
	public String getTableId(){
		return this.tableId;
	}
	public void setTableName(String tableName){
		this.tableName=tableName;
	}
	public String getTableName(){
		return this.tableName;
	}
	public void setTableComment(String tableComment){
		this.tableComment=tableComment;
	}
	public String getTableComment(){
		return this.tableComment;
	}
	public void setSubTableName(String subTableName){
		this.subTableName=subTableName;
	}
	public String getSubTableName(){
		return this.subTableName;
	}
	public void setSubTableFkName(String subTableFkName){
		this.subTableFkName=subTableFkName;
	}
	public String getSubTableFkName(){
		return this.subTableFkName;
	}
	public void setClassName(String className){
		this.className=className;
	}
	public String getClassName(){
		return this.className;
	}
	public void setTplCategory(String tplCategory){
		this.tplCategory=tplCategory;
	}
	public String getTplCategory(){
		return this.tplCategory;
	}
	public void setPackageName(String packageName){
		this.packageName=packageName;
	}
	public String getPackageName(){
		return this.packageName;
	}
	public void setModuleName(String moduleName){
		this.moduleName=moduleName;
	}
	public String getModuleName(){
		return this.moduleName;
	}
	public void setBusinessName(String businessName){
		this.businessName=businessName;
	}
	public String getBusinessName(){
		return this.businessName;
	}
	public void setFunctionName(String functionName){
		this.functionName=functionName;
	}
	public String getFunctionName(){
		return this.functionName;
	}
	public void setFunctionAuthor(String functionAuthor){
		this.functionAuthor=functionAuthor;
	}
	public String getFunctionAuthor(){
		return this.functionAuthor;
	}
	public void setGenType(String genType){
		this.genType=genType;
	}
	public String getGenType(){
		return this.genType;
	}
	public void setGenPath(String genPath){
		this.genPath=genPath;
	}
	public String getGenPath(){
		return this.genPath;
	}
	public void setOptions(String options){
		this.options=options;
	}
	public String getOptions(){
		return this.options;
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
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
	}

}