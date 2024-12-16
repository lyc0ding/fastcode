package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 角色和部门关联表
*
* @author Tom
* @date 2024-12-16
**/
public class SysRoleDept{
	/** 角色ID */
	private String roleId;

	/** 部门ID */
	private String deptId;

	/** setter、getter方法 */
	public void setRoleId(String roleId){
		this.roleId=roleId;
	}
	public String getRoleId(){
		return this.roleId;
	}
	public void setDeptId(String deptId){
		this.deptId=deptId;
	}
	public String getDeptId(){
		return this.deptId;
	}

}