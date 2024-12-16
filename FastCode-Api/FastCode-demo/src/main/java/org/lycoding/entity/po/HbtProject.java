package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 监测项目表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtProject{
	/** 监测项目主键 */
	private String projectId;

	/** 项目名称 */
	private String projectName;

	/** 项目别名 */
	private String alias;

	/** 删除标志（0代表存在 2代表删除） */
	private String delFlag;

	/** 创建人 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新人 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** setter、getter方法 */
	public void setProjectId(String projectId){
		this.projectId=projectId;
	}
	public String getProjectId(){
		return this.projectId;
	}
	public void setProjectName(String projectName){
		this.projectName=projectName;
	}
	public String getProjectName(){
		return this.projectName;
	}
	public void setAlias(String alias){
		this.alias=alias;
	}
	public String getAlias(){
		return this.alias;
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

}