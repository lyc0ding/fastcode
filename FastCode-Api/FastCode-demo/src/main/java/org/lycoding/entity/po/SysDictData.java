package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 字典数据表
*
* @author Tom
* @date 2024-12-16
**/
public class SysDictData{
	/** 字典编码 */
	private String dictCode;

	/** 字典排序 */
	private String dictSort;

	/** 字典标签 */
	private String dictLabel;

	/** 字典键值 */
	private String dictValue;

	/** 字典类型 */
	private String dictType;

	/** 样式属性（其他样式扩展） */
	private String cssClass;

	/** 表格回显样式 */
	private String listClass;

	/** 是否默认（Y是 N否） */
	private String isDefault;

	/** 状态（0正常 1停用） */
	private String status;

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
	public void setDictCode(String dictCode){
		this.dictCode=dictCode;
	}
	public String getDictCode(){
		return this.dictCode;
	}
	public void setDictSort(String dictSort){
		this.dictSort=dictSort;
	}
	public String getDictSort(){
		return this.dictSort;
	}
	public void setDictLabel(String dictLabel){
		this.dictLabel=dictLabel;
	}
	public String getDictLabel(){
		return this.dictLabel;
	}
	public void setDictValue(String dictValue){
		this.dictValue=dictValue;
	}
	public String getDictValue(){
		return this.dictValue;
	}
	public void setDictType(String dictType){
		this.dictType=dictType;
	}
	public String getDictType(){
		return this.dictType;
	}
	public void setCssClass(String cssClass){
		this.cssClass=cssClass;
	}
	public String getCssClass(){
		return this.cssClass;
	}
	public void setListClass(String listClass){
		this.listClass=listClass;
	}
	public String getListClass(){
		return this.listClass;
	}
	public void setIsDefault(String isDefault){
		this.isDefault=isDefault;
	}
	public String getIsDefault(){
		return this.isDefault;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
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