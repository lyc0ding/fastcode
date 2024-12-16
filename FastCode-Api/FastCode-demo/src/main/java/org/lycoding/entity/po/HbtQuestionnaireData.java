package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 问卷调查收集数据结果
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQuestionnaireData{
	/** 问卷调查结果id */
	private String questionnaireDataId;

	/** 问卷调查任务关联id */
	private String questionnaireId;

	/** 问卷调查类型 */
	private String questionnaireType;

	/** 关联表单模板id */
	private String templateId;

	/** 调查问卷填写结果 */
	private String content;

	/** 备注 */
	private String remark;

	/**  删除标志（0代表存在 2代表删除 */
	private String delFlag;

	/** 创建人 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新人 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setQuestionnaireDataId(String questionnaireDataId){
		this.questionnaireDataId=questionnaireDataId;
	}
	public String getQuestionnaireDataId(){
		return this.questionnaireDataId;
	}
	public void setQuestionnaireId(String questionnaireId){
		this.questionnaireId=questionnaireId;
	}
	public String getQuestionnaireId(){
		return this.questionnaireId;
	}
	public void setQuestionnaireType(String questionnaireType){
		this.questionnaireType=questionnaireType;
	}
	public String getQuestionnaireType(){
		return this.questionnaireType;
	}
	public void setTemplateId(String templateId){
		this.templateId=templateId;
	}
	public String getTemplateId(){
		return this.templateId;
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
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}