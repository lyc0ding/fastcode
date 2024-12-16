package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class UnitPersonnelGrouping{
	/**  */
	private String id;

	/** 组名 */
	private String groupName;

	/** 组长id */
	private String groupLeaderID;

	/** 组长姓名 */
	private String groupLeaderName;

	/** 组员id */
	private String groupMembersID;

	/** 组员姓名 */
	private String groupMemberName;

	/** 部门id */
	private String departmentID;

	/** 创建时间 */
	private Date createTime;

	/** 更新者 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** 删除标识 */
	private String delFlag;

	/** 创建者 */
	private String createBy;

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setGroupName(String groupName){
		this.groupName=groupName;
	}
	public String getGroupName(){
		return this.groupName;
	}
	public void setGroupLeaderID(String groupLeaderID){
		this.groupLeaderID=groupLeaderID;
	}
	public String getGroupLeaderID(){
		return this.groupLeaderID;
	}
	public void setGroupLeaderName(String groupLeaderName){
		this.groupLeaderName=groupLeaderName;
	}
	public String getGroupLeaderName(){
		return this.groupLeaderName;
	}
	public void setGroupMembersID(String groupMembersID){
		this.groupMembersID=groupMembersID;
	}
	public String getGroupMembersID(){
		return this.groupMembersID;
	}
	public void setGroupMemberName(String groupMemberName){
		this.groupMemberName=groupMemberName;
	}
	public String getGroupMemberName(){
		return this.groupMemberName;
	}
	public void setDepartmentID(String departmentID){
		this.departmentID=departmentID;
	}
	public String getDepartmentID(){
		return this.departmentID;
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
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}