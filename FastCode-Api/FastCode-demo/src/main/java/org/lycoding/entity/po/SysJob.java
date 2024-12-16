package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 定时任务调度表
*
* @author Tom
* @date 2024-12-16
**/
public class SysJob{
	/** 任务ID */
	private String jobId;

	/** 任务名称 */
	private String jobName;

	/** 任务组名 */
	private String jobGroup;

	/** 调用目标字符串 */
	private String invokeTarget;

	/** cron执行表达式 */
	private String cronExpression;

	/** 计划执行错误策略（1立即执行 2执行一次 3放弃执行） */
	private String misfirePolicy;

	/** 是否并发执行（0允许 1禁止） */
	private String concurrent;

	/** 状态（0正常 1暂停） */
	private String status;

	/** 创建者 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新者 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** 备注信息 */
	private String remark;

	/** setter、getter方法 */
	public void setJobId(String jobId){
		this.jobId=jobId;
	}
	public String getJobId(){
		return this.jobId;
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
	public void setCronExpression(String cronExpression){
		this.cronExpression=cronExpression;
	}
	public String getCronExpression(){
		return this.cronExpression;
	}
	public void setMisfirePolicy(String misfirePolicy){
		this.misfirePolicy=misfirePolicy;
	}
	public String getMisfirePolicy(){
		return this.misfirePolicy;
	}
	public void setConcurrent(String concurrent){
		this.concurrent=concurrent;
	}
	public String getConcurrent(){
		return this.concurrent;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setCreateBy(String createBy){
		this.createBy=createBy;
	}
	public String getCreateBy(){
		return this.createBy;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateBy(String updateBy){
		this.updateBy=updateBy;
	}
	public String getUpdateBy(){
		return this.updateBy;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
	}

}