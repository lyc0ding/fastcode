package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 监测任务和点位关联表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtMonitorTaskPoint{
	/** 监测任务主键 */
	private String monitorTaskId;

	/** 监测点位主键 */
	private String pointId;

	/** setter、getter方法 */
	public void setMonitorTaskId(String monitorTaskId){
		this.monitorTaskId=monitorTaskId;
	}
	public String getMonitorTaskId(){
		return this.monitorTaskId;
	}
	public void setPointId(String pointId){
		this.pointId=pointId;
	}
	public String getPointId(){
		return this.pointId;
	}

}