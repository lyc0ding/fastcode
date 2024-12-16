package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 角色和菜单关联表
*
* @author Tom
* @date 2024-12-16
**/
public class SysRoleMenu{
	/** 角色ID */
	private String roleId;

	/** 菜单ID */
	private String menuId;

	/** setter、getter方法 */
	public void setRoleId(String roleId){
		this.roleId=roleId;
	}
	public String getRoleId(){
		return this.roleId;
	}
	public void setMenuId(String menuId){
		this.menuId=menuId;
	}
	public String getMenuId(){
		return this.menuId;
	}

}