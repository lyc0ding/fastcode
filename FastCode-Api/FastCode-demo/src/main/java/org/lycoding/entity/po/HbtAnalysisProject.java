package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtAnalysisProject{
	/**  */
	private String analysisProjectId;

	/** 分析项目名称 */
	private String analysisName;

	/** 数据项代码 */
	private String dataCode;

	/** 类型 */
	private String analysisType;

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

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setAnalysisProjectId(String analysisProjectId){
		this.analysisProjectId=analysisProjectId;
	}
	public String getAnalysisProjectId(){
		return this.analysisProjectId;
	}
	public void setAnalysisName(String analysisName){
		this.analysisName=analysisName;
	}
	public String getAnalysisName(){
		return this.analysisName;
	}
	public void setDataCode(String dataCode){
		this.dataCode=dataCode;
	}
	public String getDataCode(){
		return this.dataCode;
	}
	public void setAnalysisType(String analysisType){
		this.analysisType=analysisType;
	}
	public String getAnalysisType(){
		return this.analysisType;
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
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}