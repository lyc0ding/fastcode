package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 触发器详细信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzTriggers{
	/** 调度名称 */
	private String schedName;

	/** 触发器的名字 */
	private String triggerName;

	/** 触发器所属组的名字 */
	private String triggerGroup;

	/** qrtz_job_details表job_name的外键 */
	private String jobName;

	/** qrtz_job_details表job_group的外键 */
	private String jobGroup;

	/** 相关介绍 */
	private String description;

	/** 上一次触发时间（毫秒） */
	private String nextFireTime;

	/** 下一次触发时间（默认为-1表示不触发） */
	private String prevFireTime;

	/** 优先级 */
	private String priority;

	/** 触发器状态 */
	private String triggerState;

	/** 触发器的类型 */
	private String triggerType;

	/** 开始时间 */
	private String startTime;

	/** 结束时间 */
	private String endTime;

	/** 日程表名称 */
	private String calendarName;

	/** 补偿执行的策略 */
	private String misfireInstr;

	/** 存放持久化job对象 */
	private String jobData;

	/** setter、getter方法 */
	public void setSchedName(String schedName){
		this.schedName=schedName;
	}
	public String getSchedName(){
		return this.schedName;
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
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return this.description;
	}
	public void setNextFireTime(String nextFireTime){
		this.nextFireTime=nextFireTime;
	}
	public String getNextFireTime(){
		return this.nextFireTime;
	}
	public void setPrevFireTime(String prevFireTime){
		this.prevFireTime=prevFireTime;
	}
	public String getPrevFireTime(){
		return this.prevFireTime;
	}
	public void setPriority(String priority){
		this.priority=priority;
	}
	public String getPriority(){
		return this.priority;
	}
	public void setTriggerState(String triggerState){
		this.triggerState=triggerState;
	}
	public String getTriggerState(){
		return this.triggerState;
	}
	public void setTriggerType(String triggerType){
		this.triggerType=triggerType;
	}
	public String getTriggerType(){
		return this.triggerType;
	}
	public void setStartTime(String startTime){
		this.startTime=startTime;
	}
	public String getStartTime(){
		return this.startTime;
	}
	public void setEndTime(String endTime){
		this.endTime=endTime;
	}
	public String getEndTime(){
		return this.endTime;
	}
	public void setCalendarName(String calendarName){
		this.calendarName=calendarName;
	}
	public String getCalendarName(){
		return this.calendarName;
	}
	public void setMisfireInstr(String misfireInstr){
		this.misfireInstr=misfireInstr;
	}
	public String getMisfireInstr(){
		return this.misfireInstr;
	}
	public void setJobData(String jobData){
		this.jobData=jobData;
	}
	public String getJobData(){
		return this.jobData;
	}

}