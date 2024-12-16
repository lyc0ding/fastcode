package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQualityStandard{
	/** ID */
	private String id;

	/** 分析项目ID */
	private String analysisId;

	/** 关联样品Id */
	private String sampleId;

	/** 编号 */
	private String uuid;

	/** 值 */
	private BigDecimal value;

	/** 二次值 */
	private BigDecimal valueTwo;

	/** 填写次数 */
	private String numberData;

	/** 是否合格1-合格0不合格 */
	private String status;

	/** 值创建时间 */
	private Date createTime;

	/** 值更新时间 */
	private Date updateTime;

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setAnalysisId(String analysisId){
		this.analysisId=analysisId;
	}
	public String getAnalysisId(){
		return this.analysisId;
	}
	public void setSampleId(String sampleId){
		this.sampleId=sampleId;
	}
	public String getSampleId(){
		return this.sampleId;
	}
	public void setUuid(String uuid){
		this.uuid=uuid;
	}
	public String getUuid(){
		return this.uuid;
	}
	public void setValue(BigDecimal value){
		this.value=value;
	}
	public BigDecimal getValue(){
		return this.value;
	}
	public void setValueTwo(BigDecimal valueTwo){
		this.valueTwo=valueTwo;
	}
	public BigDecimal getValueTwo(){
		return this.valueTwo;
	}
	public void setNumberData(String numberData){
		this.numberData=numberData;
	}
	public String getNumberData(){
		return this.numberData;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}