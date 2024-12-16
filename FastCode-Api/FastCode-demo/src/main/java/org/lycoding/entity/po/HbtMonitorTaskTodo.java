package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 监测任务待办
*
* @author Tom
* @date 2024-12-16
**/
public class HbtMonitorTaskTodo{
	/** 主键 */
	private String id;

	/** 关联监测任务主键 */
	private String monitorTaskId;

	/** 下发部门主键 */
	private String deptId;

	/** 关联用户主键 */
	private String userId;

	/** 删除标志（0代表存在 2代表删除） */
	private String delFlag;

	/** 创建人 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新人 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setMonitorTaskId(String monitorTaskId){
		this.monitorTaskId=monitorTaskId;
	}
	public String getMonitorTaskId(){
		return this.monitorTaskId;
	}
	public void setDeptId(String deptId){
		this.deptId=deptId;
	}
	public String getDeptId(){
		return this.deptId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setDelFlag(String delFlag){
		this.delFlag=delFlag;
	}
	public String getDelFlag(){
		return this.delFlag;
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

}