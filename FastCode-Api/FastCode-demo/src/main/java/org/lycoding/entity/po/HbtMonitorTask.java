package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 监测任务表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtMonitorTask{
	/** 监测任务ID */
	private String monitorTaskId;

	/** 监测任务编号 */
	private String monitorTaskCode;

	/** 监测任务名称 */
	private String monitorTaskName;

	/** 计划开始时间 */
	private Date planStartTime;

	/** 计划结束时间 */
	private Date planEndTime;

	/** 文件ID数组 */
	private String fileId;

	/** 意见ID数组 */
	private String opinionId;

	/** 项目id */
	private String projectId;

	/** 下发人的部门id */
	private String deptId;

	/** 任务状态 */
	private String taskStatus;

	/** 是否已删除 */
	private String delFlag;

	/** 备注 */
	private String remark;

	/** 创建人id */
	private String userId;

	/** 创建人 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setMonitorTaskId(String monitorTaskId){
		this.monitorTaskId=monitorTaskId;
	}
	public String getMonitorTaskId(){
		return this.monitorTaskId;
	}
	public void setMonitorTaskCode(String monitorTaskCode){
		this.monitorTaskCode=monitorTaskCode;
	}
	public String getMonitorTaskCode(){
		return this.monitorTaskCode;
	}
	public void setMonitorTaskName(String monitorTaskName){
		this.monitorTaskName=monitorTaskName;
	}
	public String getMonitorTaskName(){
		return this.monitorTaskName;
	}
	public void setPlanStartTime(Date planStartTime){
		this.planStartTime=planStartTime;
	}
	public Date getPlanStartTime(){
		return this.planStartTime;
	}
	public void setPlanEndTime(Date planEndTime){
		this.planEndTime=planEndTime;
	}
	public Date getPlanEndTime(){
		return this.planEndTime;
	}
	public void setFileId(String fileId){
		this.fileId=fileId;
	}
	public String getFileId(){
		return this.fileId;
	}
	public void setOpinionId(String opinionId){
		this.opinionId=opinionId;
	}
	public String getOpinionId(){
		return this.opinionId;
	}
	public void setProjectId(String projectId){
		this.projectId=projectId;
	}
	public String getProjectId(){
		return this.projectId;
	}
	public void setDeptId(String deptId){
		this.deptId=deptId;
	}
	public String getDeptId(){
		return this.deptId;
	}
	public void setTaskStatus(String taskStatus){
		this.taskStatus=taskStatus;
	}
	public String getTaskStatus(){
		return this.taskStatus;
	}
	public void setDelFlag(String delFlag){
		this.delFlag=delFlag;
	}
	public String getDelFlag(){
		return this.delFlag;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
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
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}