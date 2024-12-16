package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 菜单权限表
*
* @author Tom
* @date 2024-12-16
**/
public class SysMenu{
	/** 菜单ID */
	private String menuId;

	/** 菜单名称 */
	private String menuName;

	/** 父菜单ID */
	private String parentId;

	/** 显示顺序 */
	private String orderNum;

	/** 路由地址 */
	private String path;

	/** 组件路径 */
	private String component;

	/** 路由参数 */
	private String query;

	/** 是否为外链（0是 1否） */
	private String isFrame;

	/** 是否缓存（0缓存 1不缓存） */
	private String isCache;

	/** 菜单类型（M目录 C菜单 F按钮） */
	private String menuType;

	/** 菜单状态（0显示 1隐藏） */
	private String visible;

	/** 菜单状态（0正常 1停用） */
	private String status;

	/** 权限标识 */
	private String perms;

	/** 菜单图标 */
	private String icon;

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
	public void setMenuId(String menuId){
		this.menuId=menuId;
	}
	public String getMenuId(){
		return this.menuId;
	}
	public void setMenuName(String menuName){
		this.menuName=menuName;
	}
	public String getMenuName(){
		return this.menuName;
	}
	public void setParentId(String parentId){
		this.parentId=parentId;
	}
	public String getParentId(){
		return this.parentId;
	}
	public void setOrderNum(String orderNum){
		this.orderNum=orderNum;
	}
	public String getOrderNum(){
		return this.orderNum;
	}
	public void setPath(String path){
		this.path=path;
	}
	public String getPath(){
		return this.path;
	}
	public void setComponent(String component){
		this.component=component;
	}
	public String getComponent(){
		return this.component;
	}
	public void setQuery(String query){
		this.query=query;
	}
	public String getQuery(){
		return this.query;
	}
	public void setIsFrame(String isFrame){
		this.isFrame=isFrame;
	}
	public String getIsFrame(){
		return this.isFrame;
	}
	public void setIsCache(String isCache){
		this.isCache=isCache;
	}
	public String getIsCache(){
		return this.isCache;
	}
	public void setMenuType(String menuType){
		this.menuType=menuType;
	}
	public String getMenuType(){
		return this.menuType;
	}
	public void setVisible(String visible){
		this.visible=visible;
	}
	public String getVisible(){
		return this.visible;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setPerms(String perms){
		this.perms=perms;
	}
	public String getPerms(){
		return this.perms;
	}
	public void setIcon(String icon){
		this.icon=icon;
	}
	public String getIcon(){
		return this.icon;
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