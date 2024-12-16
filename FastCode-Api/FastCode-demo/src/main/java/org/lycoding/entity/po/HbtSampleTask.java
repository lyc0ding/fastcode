package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 采样任务信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleTask{
	/** 主键 */
	private String sampleTaskId;

	/** 关联用户id（数据权限过滤） */
	private String userId;

	/** 用户数组 */
	private String userIds;

	/** 采样任务编号 */
	private String sampleTaskCode;

	/** 点位id */
	private String pointId;

	/** 监测任务id */
	private String monitorTaskId;

	/** 采样人id */
	private String samplerId;

	/** 采样任务名称 */
	private String taskName;

	/** 执行状态 */
	private String executeStatus;

	/** 任务分配结束时间 */
	private Date allocationEndTime;

	/** 任务开始时间 */
	private Date startTime;

	/** 任务结束时间 */
	private Date endTime;

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

	/** 指派分组id */
	private String groupId;

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setSampleTaskId(String sampleTaskId){
		this.sampleTaskId=sampleTaskId;
	}
	public String getSampleTaskId(){
		return this.sampleTaskId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setUserIds(String userIds){
		this.userIds=userIds;
	}
	public String getUserIds(){
		return this.userIds;
	}
	public void setSampleTaskCode(String sampleTaskCode){
		this.sampleTaskCode=sampleTaskCode;
	}
	public String getSampleTaskCode(){
		return this.sampleTaskCode;
	}
	public void setPointId(String pointId){
		this.pointId=pointId;
	}
	public String getPointId(){
		return this.pointId;
	}
	public void setMonitorTaskId(String monitorTaskId){
		this.monitorTaskId=monitorTaskId;
	}
	public String getMonitorTaskId(){
		return this.monitorTaskId;
	}
	public void setSamplerId(String samplerId){
		this.samplerId=samplerId;
	}
	public String getSamplerId(){
		return this.samplerId;
	}
	public void setTaskName(String taskName){
		this.taskName=taskName;
	}
	public String getTaskName(){
		return this.taskName;
	}
	public void setExecuteStatus(String executeStatus){
		this.executeStatus=executeStatus;
	}
	public String getExecuteStatus(){
		return this.executeStatus;
	}
	public void setAllocationEndTime(Date allocationEndTime){
		this.allocationEndTime=allocationEndTime;
	}
	public Date getAllocationEndTime(){
		return this.allocationEndTime;
	}
	public void setStartTime(Date startTime){
		this.startTime=startTime;
	}
	public Date getStartTime(){
		return this.startTime;
	}
	public void setEndTime(Date endTime){
		this.endTime=endTime;
	}
	public Date getEndTime(){
		return this.endTime;
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
	public void setGroupId(String groupId){
		this.groupId=groupId;
	}
	public String getGroupId(){
		return this.groupId;
	}
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}