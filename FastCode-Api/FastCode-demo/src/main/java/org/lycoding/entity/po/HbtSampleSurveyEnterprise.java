package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 采样任务企业调查
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleSurveyEnterprise{
	/** 采样企业调查id */
	private String surveyEnterpriseId;

	/** 关联采样任务id */
	private String sampleTaskId;

	/** 关联表单模板id */
	private String templateId;

	/** 调查内容 */
	private String content;

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

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setSurveyEnterpriseId(String surveyEnterpriseId){
		this.surveyEnterpriseId=surveyEnterpriseId;
	}
	public String getSurveyEnterpriseId(){
		return this.surveyEnterpriseId;
	}
	public void setSampleTaskId(String sampleTaskId){
		this.sampleTaskId=sampleTaskId;
	}
	public String getSampleTaskId(){
		return this.sampleTaskId;
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