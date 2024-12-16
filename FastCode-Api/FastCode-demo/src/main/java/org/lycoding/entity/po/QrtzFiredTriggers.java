package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 已触发的触发器表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzFiredTriggers{
	/** 调度名称 */
	private String schedName;

	/** 调度器实例id */
	private String entryId;

	/** qrtz_triggers表trigger_name的外键 */
	private String triggerName;

	/** qrtz_triggers表trigger_group的外键 */
	private String triggerGroup;

	/** 调度器实例名 */
	private String instanceName;

	/** 触发的时间 */
	private String firedTime;

	/** 定时器制定的时间 */
	private String schedTime;

	/** 优先级 */
	private String priority;

	/** 状态 */
	private String state;

	/** 任务名称 */
	private String jobName;

	/** 任务组名 */
	private String jobGroup;

	/** 是否并发 */
	private String isNonconcurrent;

	/** 是否接受恢复执行 */
	private String requestsRecovery;

	/** setter、getter方法 */
	public void setSchedName(String schedName){
		this.schedName=schedName;
	}
	public String getSchedName(){
		return this.schedName;
	}
	public void setEntryId(String entryId){
		this.entryId=entryId;
	}
	public String getEntryId(){
		return this.entryId;
	}
	public void setTriggerName(String triggerName){
		this.triggerName=triggerName;
	}
	public String getTriggerName(){
		return this.triggerName;
	}
	public void setTriggerGroup(String triggerGroup){
		this.triggerGroup=triggerGroup;
	}
	public String getTriggerGroup(){
		return this.triggerGroup;
	}
	public void setInstanceName(String instanceName){
		this.instanceName=instanceName;
	}
	public String getInstanceName(){
		return this.instanceName;
	}
	public void setFiredTime(String firedTime){
		this.firedTime=firedTime;
	}
	public String getFiredTime(){
		return this.firedTime;
	}
	public void setSchedTime(String schedTime){
		this.schedTime=schedTime;
	}
	public String getSchedTime(){
		return this.schedTime;
	}
	public void setPriority(String priority){
		this.priority=priority;
	}
	public String getPriority(){
		return this.priority;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setJobName(String jobName){
		this.jobName=jobName;
	}
	public String getJobName(){
		return this.jobName;
	}
	public void setJobGroup(String jobGroup){
		this.jobGroup=jobGroup;
	}
	public String getJobGroup(){
		return this.jobGroup;
	}
	public void setIsNonconcurrent(String isNonconcurrent){
		this.isNonconcurrent=isNonconcurrent;
	}
	public String getIsNonconcurrent(){
		return this.isNonconcurrent;
	}
	public void setRequestsRecovery(String requestsRecovery){
		this.requestsRecovery=requestsRecovery;
	}
	public String getRequestsRecovery(){
		return this.requestsRecovery;
	}

}