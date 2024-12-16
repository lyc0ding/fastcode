package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 调度器状态表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzSchedulerState{
	/** 调度名称 */
	private String schedName;

	/** 实例名称 */
	private String instanceName;

	/** 上次检查时间 */
	private String lastCheckinTime;

	/** 检查间隔时间 */
	private String checkinInterval;

	/** setter、getter方法 */
	public void setSchedName(String schedName){
		this.schedName=schedName;
	}
	public String getSchedName(){
		return this.schedName;
	}
	public void setInstanceName(String instanceName){
		this.instanceName=instanceName;
	}
	public String getInstanceName(){
		return this.instanceName;
	}
	public void setLastCheckinTime(String lastCheckinTime){
		this.lastCheckinTime=lastCheckinTime;
	}
	public String getLastCheckinTime(){
		return this.lastCheckinTime;
	}
	public void setCheckinInterval(String checkinInterval){
		this.checkinInterval=checkinInterval;
	}
	public String getCheckinInterval(){
		return this.checkinInterval;
	}

}