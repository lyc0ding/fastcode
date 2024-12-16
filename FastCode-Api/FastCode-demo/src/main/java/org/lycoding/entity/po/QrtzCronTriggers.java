package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description Cron类型的触发器表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzCronTriggers{
	/** 调度名称 */
	private String schedName;

	/** qrtz_triggers表trigger_name的外键 */
	private String triggerName;

	/** qrtz_triggers表trigger_group的外键 */
	private String triggerGroup;

	/** cron表达式 */
	private String cronExpression;

	/** 时区 */
	private String timeZoneId;

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
	public void setCronExpression(String cronExpression){
		this.cronExpression=cronExpression;
	}
	public String getCronExpression(){
		return this.cronExpression;
	}
	public void setTimeZoneId(String timeZoneId){
		this.timeZoneId=timeZoneId;
	}
	public String getTimeZoneId(){
		return this.timeZoneId;
	}

}