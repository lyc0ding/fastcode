package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 系统访问记录
*
* @author Tom
* @date 2024-12-16
**/
public class SysLogininfor{
	/** 访问ID */
	private String infoId;

	/** 用户账号 */
	private String userName;

	/** 登录IP地址 */
	private String ipaddr;

	/** 登录地点 */
	private String loginLocation;

	/** 浏览器类型 */
	private String browser;

	/** 操作系统 */
	private String os;

	/** 登录状态（0成功 1失败） */
	private String status;

	/** 提示消息 */
	private String msg;

	/** 访问时间 */
	private Date loginTime;

	/** setter、getter方法 */
	public void setInfoId(String infoId){
		this.infoId=infoId;
	}
	public String getInfoId(){
		return this.infoId;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setIpaddr(String ipaddr){
		this.ipaddr=ipaddr;
	}
	public String getIpaddr(){
		return this.ipaddr;
	}
	public void setLoginLocation(String loginLocation){
		this.loginLocation=loginLocation;
	}
	public String getLoginLocation(){
		return this.loginLocation;
	}
	public void setBrowser(String browser){
		this.browser=browser;
	}
	public String getBrowser(){
		return this.browser;
	}
	public void setOs(String os){
		this.os=os;
	}
	public String getOs(){
		return this.os;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setMsg(String msg){
		this.msg=msg;
	}
	public String getMsg(){
		return this.msg;
	}
	public void setLoginTime(Date loginTime){
		this.loginTime=loginTime;
	}
	public Date getLoginTime(){
		return this.loginTime;
	}

}