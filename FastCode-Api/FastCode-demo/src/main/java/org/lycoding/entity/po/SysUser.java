package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 用户信息表
*
* @author Tom
* @date 2024-12-16
**/
public class SysUser{
	/** 用户ID */
	private String userId;

	/** 部门ID */
	private String deptId;

	/** 用户账号 */
	private String userName;

	/** 用户昵称 */
	private String nickName;

	/** 用户类型（sys_user系统用户） */
	private String userType;

	/** 用户邮箱 */
	private String email;

	/** 手机号码 */
	private String phonenumber;

	/** 用户性别（0男 1女 2未知） */
	private String sex;

	/** 头像地址 */
	private String avatar;

	/** 密码 */
	private String password;

	/** 帐号状态（0正常 1停用） */
	private String status;

	/** 删除标志（0代表存在 2代表删除） */
	private String delFlag;

	/** 最后登录IP */
	private String loginIp;

	/** 最后登录时间 */
	private Date loginDate;

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

	/** 客户端设备唯一标识 */
	private String clientId;

	/** 最后一次密码修改时间 */
	private Date pwdUpdateTime;

	/** 迁移标识 */
	private String isTransfer;

	/** setter、getter方法 */
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setDeptId(String deptId){
		this.deptId=deptId;
	}
	public String getDeptId(){
		return this.deptId;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setNickName(String nickName){
		this.nickName=nickName;
	}
	public String getNickName(){
		return this.nickName;
	}
	public void setUserType(String userType){
		this.userType=userType;
	}
	public String getUserType(){
		return this.userType;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setPhonenumber(String phonenumber){
		this.phonenumber=phonenumber;
	}
	public String getPhonenumber(){
		return this.phonenumber;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return this.sex;
	}
	public void setAvatar(String avatar){
		this.avatar=avatar;
	}
	public String getAvatar(){
		return this.avatar;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
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
	public void setLoginIp(String loginIp){
		this.loginIp=loginIp;
	}
	public String getLoginIp(){
		return this.loginIp;
	}
	public void setLoginDate(Date loginDate){
		this.loginDate=loginDate;
	}
	public Date getLoginDate(){
		return this.loginDate;
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
	public void setClientId(String clientId){
		this.clientId=clientId;
	}
	public String getClientId(){
		return this.clientId;
	}
	public void setPwdUpdateTime(Date pwdUpdateTime){
		this.pwdUpdateTime=pwdUpdateTime;
	}
	public Date getPwdUpdateTime(){
		return this.pwdUpdateTime;
	}
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}