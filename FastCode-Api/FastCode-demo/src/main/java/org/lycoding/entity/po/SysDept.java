package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 部门表
*
* @author Tom
* @date 2024-12-16
**/
public class SysDept{
	/** 部门id */
	private String deptId;

	/** 父部门id */
	private String parentId;

	/** 祖级列表 */
	private String ancestors;

	/** 部门名称 */
	private String deptName;

	/** 部门类型（0采样制样 1样品制备 2流转中心 3检测实验室 4调查单位） */
	private String deptType;

	/** 显示顺序 */
	private String orderNum;

	/** 负责人 */
	private String leader;

	/** 联系电话 */
	private String phone;

	/** 邮箱 */
	private String email;

	/** 部门状态（0正常 1停用） */
	private String status;

	/** 删除标志（0代表存在 2代表删除） */
	private String delFlag;

	/** 创建者 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新者 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** 迁移标识 */
	private String isTransfer;

	/** setter、getter方法 */
	public void setDeptId(String deptId){
		this.deptId=deptId;
	}
	public String getDeptId(){
		return this.deptId;
	}
	public void setParentId(String parentId){
		this.parentId=parentId;
	}
	public String getParentId(){
		return this.parentId;
	}
	public void setAncestors(String ancestors){
		this.ancestors=ancestors;
	}
	public String getAncestors(){
		return this.ancestors;
	}
	public void setDeptName(String deptName){
		this.deptName=deptName;
	}
	public String getDeptName(){
		return this.deptName;
	}
	public void setDeptType(String deptType){
		this.deptType=deptType;
	}
	public String getDeptType(){
		return this.deptType;
	}
	public void setOrderNum(String orderNum){
		this.orderNum=orderNum;
	}
	public String getOrderNum(){
		return this.orderNum;
	}
	public void setLeader(String leader){
		this.leader=leader;
	}
	public String getLeader(){
		return this.leader;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
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
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}