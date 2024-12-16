package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 问卷表单模板
*
* @author Tom
* @date 2024-12-16
**/
public class HbtFormTemplate{
	/** 主键 */
	private String id;

	/** 表单模板名称 */
	private String name;

	/** 模板分类 调查问卷、采样 */
	private String classification;

	/** 表单模板类型。关联字典数据 */
	private String type;

	/** 模板内容 */
	private String content;

	/** 备注 */
	private String remark;

	/** 删除标志（0代表存在 2代表删除） */
	private String delFlag;

	/** 创建人 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新人 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setClassification(String classification){
		this.classification=classification;
	}
	public String getClassification(){
		return this.classification;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return this.type;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setDelFlag(String delFlag){
		this.delFlag=delFlag;
	}
	public String getDelFlag(){
		return this.delFlag;
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