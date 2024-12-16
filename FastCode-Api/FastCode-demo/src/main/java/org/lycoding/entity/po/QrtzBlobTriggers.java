package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description Blob类型的触发器表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzBlobTriggers{
	/** 调度名称 */
	private String schedName;

	/** qrtz_triggers表trigger_name的外键 */
	private String triggerName;

	/** qrtz_triggers表trigger_group的外键 */
	private String triggerGroup;

	/** 存放持久化Trigger对象 */
	private String blobData;

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
	public void setBlobData(String blobData){
		this.blobData=blobData;
	}
	public String getBlobData(){
		return this.blobData;
	}

}