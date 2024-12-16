package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 任务详细信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzJobDetails{
	/** 调度名称 */
	private String schedName;

	/** 任务名称 */
	private String jobName;

	/** 任务组名 */
	private String jobGroup;

	/** 相关介绍 */
	private String description;

	/** 执行任务类名称 */
	private String jobClassName;

	/** 是否持久化 */
	private String isDurable;

	/** 是否并发 */
	private String isNonconcurrent;

	/** 是否更新数据 */
	private String isUpdateData;

	/** 是否接受恢复执行 */
	private String requestsRecovery;

	/** 存放持久化job对象 */
	private String jobData;

	/** setter、getter方法 */
	public void setSchedName(String schedName){
		this.schedName=schedName;
	}
	public String getSchedName(){
		return this.schedName;
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
	public void setJobClassName(String jobClassName){
		this.jobClassName=jobClassName;
	}
	public String getJobClassName(){
		return this.jobClassName;
	}
	public void setIsDurable(String isDurable){
		this.isDurable=isDurable;
	}
	public String getIsDurable(){
		return this.isDurable;
	}
	public void setIsNonconcurrent(String isNonconcurrent){
		this.isNonconcurrent=isNonconcurrent;
	}
	public String getIsNonconcurrent(){
		return this.isNonconcurrent;
	}
	public void setIsUpdateData(String isUpdateData){
		this.isUpdateData=isUpdateData;
	}
	public String getIsUpdateData(){
		return this.isUpdateData;
	}
	public void setRequestsRecovery(String requestsRecovery){
		this.requestsRecovery=requestsRecovery;
	}
	public String getRequestsRecovery(){
		return this.requestsRecovery;
	}
	public void setJobData(String jobData){
		this.jobData=jobData;
	}
	public String getJobData(){
		return this.jobData;
	}

}