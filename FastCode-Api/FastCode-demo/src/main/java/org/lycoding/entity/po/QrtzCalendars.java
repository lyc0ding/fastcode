package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 日历信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzCalendars{
	/** 调度名称 */
	private String schedName;

	/** 日历名称 */
	private String calendarName;

	/** 存放持久化calendar对象 */
	private String calendar;

	/** setter、getter方法 */
	public void setSchedName(String schedName){
		this.schedName=schedName;
	}
	public String getSchedName(){
		return this.schedName;
	}
	public void setCalendarName(String calendarName){
		this.calendarName=calendarName;
	}
	public String getCalendarName(){
		return this.calendarName;
	}
	public void setCalendar(String calendar){
		this.calendar=calendar;
	}
	public String getCalendar(){
		return this.calendar;
	}

}