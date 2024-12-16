package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 用户和角色关联表
*
* @author Tom
* @date 2024-12-16
**/
public class SysUserRole{
	/** 用户ID */
	private String userId;

	/** 角色ID */
	private String roleId;

	/** setter、getter方法 */
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setRoleId(String roleId){
		this.roleId=roleId;
	}
	public String getRoleId(){
		return this.roleId;
	}

}