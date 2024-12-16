package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 简单触发器的信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzSimpleTriggers{
	/** 调度名称 */
	private String schedName;

	/** qrtz_triggers表trigger_name的外键 */
	private String triggerName;

	/** qrtz_triggers表trigger_group的外键 */
	private String triggerGroup;

	/** 重复的次数统计 */
	private String repeatCount;

	/** 重复的间隔时间 */
	private String repeatInterval;

	/** 已经触发的次数 */
	private String timesTriggered;

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
	public void setRepeatCount(String repeatCount){
		this.repeatCount=repeatCount;
	}
	public String getRepeatCount(){
		return this.repeatCount;
	}
	public void setRepeatInterval(String repeatInterval){
		this.repeatInterval=repeatInterval;
	}
	public String getRepeatInterval(){
		return this.repeatInterval;
	}
	public void setTimesTriggered(String timesTriggered){
		this.timesTriggered=timesTriggered;
	}
	public String getTimesTriggered(){
		return this.timesTriggered;
	}

}