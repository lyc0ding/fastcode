package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 暂停的触发器表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzPausedTriggerGrps{
	/** 调度名称 */
	private String schedName;

	/** qrtz_triggers表trigger_group的外键 */
	private String triggerGroup;

	/** setter、getter方法 */
	public void setSchedName(String schedName){
		this.schedName=schedName;
	}
	public String getSchedName(){
		return this.schedName;
	}
	public void setTriggerGroup(String triggerGroup){
		this.triggerGroup=triggerGroup;
	}
	public String getTriggerGroup(){
		return this.triggerGroup;
	}

}