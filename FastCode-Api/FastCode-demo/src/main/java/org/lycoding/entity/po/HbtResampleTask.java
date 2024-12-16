package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 重采任务表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtResampleTask{
	/** 重采任务id */
	private String resampleTaskId;

	/** 重采任务编号 */
	private String resampleTaskCode;

	/** 重采样品编号 */
	private String resampleSampleCode;

	/** 重采用户id */
	private String resampleUserId;

	/** 原采样任务id */
	private String sampleTaskId;

	/** 原样品编号 */
	private String sampleCode;

	/** 部门id */
	private String deptId;

	/** 原样品id */
	private String sampleId;

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

	/** 迁移标识 */
	private String isTransfer;

	/** setter、getter方法 */
	public void setResampleTaskId(String resampleTaskId){
		this.resampleTaskId=resampleTaskId;
	}
	public String getResampleTaskId(){
		return this.resampleTaskId;
	}
	public void setResampleTaskCode(String resampleTaskCode){
		this.resampleTaskCode=resampleTaskCode;
	}
	public String getResampleTaskCode(){
		return this.resampleTaskCode;
	}
	public void setResampleSampleCode(String resampleSampleCode){
		this.resampleSampleCode=resampleSampleCode;
	}
	public String getResampleSampleCode(){
		return this.resampleSampleCode;
	}
	public void setResampleUserId(String resampleUserId){
		this.resampleUserId=resampleUserId;
	}
	public String getResampleUserId(){
		return this.resampleUserId;
	}
	public void setSampleTaskId(String sampleTaskId){
		this.sampleTaskId=sampleTaskId;
	}
	public String getSampleTaskId(){
		return this.sampleTaskId;
	}
	public void setSampleCode(String sampleCode){
		this.sampleCode=sampleCode;
	}
	public String getSampleCode(){
		return this.sampleCode;
	}
	public void setDeptId(String deptId){
		this.deptId=deptId;
	}
	public String getDeptId(){
		return this.deptId;
	}
	public void setSampleId(String sampleId){
		this.sampleId=sampleId;
	}
	public String getSampleId(){
		return this.sampleId;
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