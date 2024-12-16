package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 样品信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleInfo{
	/** 主键 */
	private String sampleId;

	/** 样品编号 */
	private String sampleCode;

	/** 证书编号id */
	private String controlId;

	/** 样品种类 */
	private String kinds;

	/** 二维码 */
	private String qrcode;

	/** 样品类型：0-空白样，1-原样，2-平行样，3-标准样 */
	private String sampleType;

	/** 关联分析项目 */
	private String analysisProject;

	/** 采集样品分析项目 */
	private String collectProject;

	/** 样品量，重量或容量 */
	private String weight;

	/** 重量单位 */
	private String weightUnit;

	/** 仪器信息 */
	private String instrumentInfo;

	/** 保存方式 */
	private String saveWay;

	/** 作废标志 1-作废 */
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

	/** 作废备注 */
	private String remark;

	/** setter、getter方法 */
	public void setSampleId(String sampleId){
		this.sampleId=sampleId;
	}
	public String getSampleId(){
		return this.sampleId;
	}
	public void setSampleCode(String sampleCode){
		this.sampleCode=sampleCode;
	}
	public String getSampleCode(){
		return this.sampleCode;
	}
	public void setControlId(String controlId){
		this.controlId=controlId;
	}
	public String getControlId(){
		return this.controlId;
	}
	public void setKinds(String kinds){
		this.kinds=kinds;
	}
	public String getKinds(){
		return this.kinds;
	}
	public void setQrcode(String qrcode){
		this.qrcode=qrcode;
	}
	public String getQrcode(){
		return this.qrcode;
	}
	public void setSampleType(String sampleType){
		this.sampleType=sampleType;
	}
	public String getSampleType(){
		return this.sampleType;
	}
	public void setAnalysisProject(String analysisProject){
		this.analysisProject=analysisProject;
	}
	public String getAnalysisProject(){
		return this.analysisProject;
	}
	public void setCollectProject(String collectProject){
		this.collectProject=collectProject;
	}
	public String getCollectProject(){
		return this.collectProject;
	}
	public void setWeight(String weight){
		this.weight=weight;
	}
	public String getWeight(){
		return this.weight;
	}
	public void setWeightUnit(String weightUnit){
		this.weightUnit=weightUnit;
	}
	public String getWeightUnit(){
		return this.weightUnit;
	}
	public void setInstrumentInfo(String instrumentInfo){
		this.instrumentInfo=instrumentInfo;
	}
	public String getInstrumentInfo(){
		return this.instrumentInfo;
	}
	public void setSaveWay(String saveWay){
		this.saveWay=saveWay;
	}
	public String getSaveWay(){
		return this.saveWay;
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