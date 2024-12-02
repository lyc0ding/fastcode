package org.lycoding.entity.po;

import java.sql.Date;

/**
 * Description:部门表
 *
 * @author:Tom
 * Mon Dec 02 17:58:00 GMT+08:00 2024
*/
public class Dept{
	/** 部门id */
	private Integer deptId;

	/** 部门名 */
	private String deptName;

	/** 部门领导 */
	private Integer deptLeader;

	/** 创建时间 */
	private Date createTime;

	/** 0：存在  1：删除 */
	private String status;

	/** setter、getter方法 */
	public void setDeptId(Integer deptId){
		this.deptId=deptId;
	}
	public Integer getDeptId(){
		return this.deptId;
	}
	public void setDeptName(String deptName){
		this.deptName=deptName;
	}
	public String getDeptName(){
		return this.deptName;
	}
	public void setDeptLeader(Integer deptLeader){
		this.deptLeader=deptLeader;
	}
	public Integer getDeptLeader(){
		return this.deptLeader;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

}