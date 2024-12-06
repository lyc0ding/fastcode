package org.lycoding.entity.po;

import java.sql.Date;

/**
 * Description:员工表
 *
 * @author:Tom
 * Fri Dec 06 16:00:34 GMT+08:00 2024
*/
public class Employer{
	/** 用户表id */
	private Integer id;

	/** 用户名 */
	private String userName;

	/** 密码 */
	private String password;

	/** 创建时间 */
	private Date createTime;

	/** 0：存在  1：删除 */
	private String status;

	/** setter、getter方法 */
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
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