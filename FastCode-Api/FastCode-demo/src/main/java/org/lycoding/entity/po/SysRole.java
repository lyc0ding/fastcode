package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 角色信息表
*
* @author Tom
* @date 2024-12-16
**/
public class SysRole{
	/** 角色ID */
	private String roleId;

	/** 角色名称 */
	private String roleName;

	/** 角色权限字符串 */
	private String roleKey;

	/** 显示顺序 */
	private String roleSort;

	/** 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限） */
	private String dataScope;

	/** 菜单树选择项是否关联显示 */
	private String menuCheckStrictly;

	/** 部门树选择项是否关联显示 */
	private String deptCheckStrictly;

	/** 角色状态（0正常 1停用） */
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

	/** 备注 */
	private String remark;

	/** setter、getter方法 */
	public void setRoleId(String roleId){
		this.roleId=roleId;
	}
	public String getRoleId(){
		return this.roleId;
	}
	public void setRoleName(String roleName){
		this.roleName=roleName;
	}
	public String getRoleName(){
		return this.roleName;
	}
	public void setRoleKey(String roleKey){
		this.roleKey=roleKey;
	}
	public String getRoleKey(){
		return this.roleKey;
	}
	public void setRoleSort(String roleSort){
		this.roleSort=roleSort;
	}
	public String getRoleSort(){
		return this.roleSort;
	}
	public void setDataScope(String dataScope){
		this.dataScope=dataScope;
	}
	public String getDataScope(){
		return this.dataScope;
	}
	public void setMenuCheckStrictly(String menuCheckStrictly){
		this.menuCheckStrictly=menuCheckStrictly;
	}
	public String getMenuCheckStrictly(){
		return this.menuCheckStrictly;
	}
	public void setDeptCheckStrictly(String deptCheckStrictly){
		this.deptCheckStrictly=deptCheckStrictly;
	}
	public String getDeptCheckStrictly(){
		return this.deptCheckStrictly;
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
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
	}

}