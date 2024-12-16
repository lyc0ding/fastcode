package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 证书编号信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQualityItem{
	/** 证书编号主表id */
	private String qualityId;

	/** 分析项目id */
	private String analysisProjectId;

	/** 下限 */
	private String lowerLimit;

	/** 上限 */
	private String upperLimit;

	/** 单位 */
	private String unit;

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

	/** 备注 */
	private String remark;

	/** setter、getter方法 */
	public void setQualityId(String qualityId){
		this.qualityId=qualityId;
	}
	public String getQualityId(){
		return this.qualityId;
	}
	public void setAnalysisProjectId(String analysisProjectId){
		this.analysisProjectId=analysisProjectId;
	}
	public String getAnalysisProjectId(){
		return this.analysisProjectId;
	}
	public void setLowerLimit(String lowerLimit){
		this.lowerLimit=lowerLimit;
	}
	public String getLowerLimit(){
		return this.lowerLimit;
	}
	public void setUpperLimit(String upperLimit){
		this.upperLimit=upperLimit;
	}
	public String getUpperLimit(){
		return this.upperLimit;
	}
	public void setUnit(String unit){
		this.unit=unit;
	}
	public String getUnit(){
		return this.unit;
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