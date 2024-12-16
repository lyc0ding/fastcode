package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 定时任务调度日志表
*
* @author Tom
* @date 2024-12-16
**/
public class SysJobLog{
	/** 任务日志ID */
	private String jobLogId;

	/** 任务名称 */
	private String jobName;

	/** 任务组名 */
	private String jobGroup;

	/** 调用目标字符串 */
	private String invokeTarget;

	/** 日志信息 */
	private String jobMessage;

	/** 执行状态（0正常 1失败） */
	private String status;

	/** 异常信息 */
	private String exceptionInfo;

	/** 创建时间 */
	private Date createTime;

	/** setter、getter方法 */
	public void setJobLogId(String jobLogId){
		this.jobLogId=jobLogId;
	}
	public String getJobLogId(){
		return this.jobLogId;
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
	public void setInvokeTarget(String invokeTarget){
		this.invokeTarget=invokeTarget;
	}
	public String getInvokeTarget(){
		return this.invokeTarget;
	}
	public void setJobMessage(String jobMessage){
		this.jobMessage=jobMessage;
	}
	public String getJobMessage(){
		return this.jobMessage;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setExceptionInfo(String exceptionInfo){
		this.exceptionInfo=exceptionInfo;
	}
	public String getExceptionInfo(){
		return this.exceptionInfo;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}

}