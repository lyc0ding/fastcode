package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 问卷调查任务
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQuestionnaireTask{
	/** 调查任务主键 */
	private String questionnaireId;

	/** 任务编号 */
	private String questionnaireCode;

	/** 部门id */
	private String deptId;

	/** 监测项目主键 */
	private String projectId;

	/** 调查区域 */
	private String area;

	/** 调查地址 */
	private String address;

	/** 删除标志（0代表存在 2代表删除） */
	private String delFlag;

	/** 创建人ID */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新人 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** setter、getter方法 */
	public void setQuestionnaireId(String questionnaireId){
		this.questionnaireId=questionnaireId;
	}
	public String getQuestionnaireId(){
		return this.questionnaireId;
	}
	public void setQuestionnaireCode(String questionnaireCode){
		this.questionnaireCode=questionnaireCode;
	}
	public String getQuestionnaireCode(){
		return this.questionnaireCode;
	}
	public void setDeptId(String deptId){
		this.deptId=deptId;
	}
	public String getDeptId(){
		return this.deptId;
	}
	public void setProjectId(String projectId){
		this.projectId=projectId;
	}
	public String getProjectId(){
		return this.projectId;
	}
	public void setArea(String area){
		this.area=area;
	}
	public String getArea(){
		return this.area;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return this.address;
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