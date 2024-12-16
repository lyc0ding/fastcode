package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleCollectionsInfo{
	/** 主键 */
	private String sampleId;

	/** 样品编号 */
	private String sampleCode;

	/** 证书编号id */
	private String controlId;

	/** 样品采集id */
	private String collectionId;

	/** 采集中间表id */
	private String middleId;

	/** 样品种类 */
	private String sampleKinds;

	/** 二维码 */
	private String qrcode;

	/** 样品类型：0-空白样，1-原样，2-平行样，3-标准样 */
	private String sampleType;

	/** 平行样 0-否  1-是 */
	private String sampleParallel;

	/** 0-室内平行 1-室间平行 */
	private String roomParallel;

	/** 关联分析项目  */
	private String analysisProject;

	/** 采集样品分析项目 */
	private String collectProject;

	/** 保存方式 */
	private String saveWay;

	/** 采样信息 */
	private String collectionContent;

	/** 采样人 */
	private String sampler;

	/** 采样日期 */
	private Date samplingTime;

	/** 送样人 */
	private String sender;

	/** 送样日期 */
	private Date sendingTime;

	/** 接样人 */
	private String hander;

	/** 接样日期 */
	private Date handingTime;

	/** 作废方式 1-作废 */
	private String status;

	/** 创建时间 */
	private Date createTime;

	/** 删除标准（0-存在 2-删除） */
	private String delFlag;

	/** 创建者 */
	private String createBy;

	/** 更新者 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** 样品作废备注 */
	private String cancellationRemark;

	/**  */
	private String isTransfer;

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
	public void setCollectionId(String collectionId){
		this.collectionId=collectionId;
	}
	public String getCollectionId(){
		return this.collectionId;
	}
	public void setMiddleId(String middleId){
		this.middleId=middleId;
	}
	public String getMiddleId(){
		return this.middleId;
	}
	public void setSampleKinds(String sampleKinds){
		this.sampleKinds=sampleKinds;
	}
	public String getSampleKinds(){
		return this.sampleKinds;
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
	public void setSampleParallel(String sampleParallel){
		this.sampleParallel=sampleParallel;
	}
	public String getSampleParallel(){
		return this.sampleParallel;
	}
	public void setRoomParallel(String roomParallel){
		this.roomParallel=roomParallel;
	}
	public String getRoomParallel(){
		return this.roomParallel;
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
	public void setSaveWay(String saveWay){
		this.saveWay=saveWay;
	}
	public String getSaveWay(){
		return this.saveWay;
	}
	public void setCollectionContent(String collectionContent){
		this.collectionContent=collectionContent;
	}
	public String getCollectionContent(){
		return this.collectionContent;
	}
	public void setSampler(String sampler){
		this.sampler=sampler;
	}
	public String getSampler(){
		return this.sampler;
	}
	public void setSamplingTime(Date samplingTime){
		this.samplingTime=samplingTime;
	}
	public Date getSamplingTime(){
		return this.samplingTime;
	}
	public void setSender(String sender){
		this.sender=sender;
	}
	public String getSender(){
		return this.sender;
	}
	public void setSendingTime(Date sendingTime){
		this.sendingTime=sendingTime;
	}
	public Date getSendingTime(){
		return this.sendingTime;
	}
	public void setHander(String hander){
		this.hander=hander;
	}
	public String getHander(){
		return this.hander;
	}
	public void setHandingTime(Date handingTime){
		this.handingTime=handingTime;
	}
	public Date getHandingTime(){
		return this.handingTime;
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
	public void setCancellationRemark(String cancellationRemark){
		this.cancellationRemark=cancellationRemark;
	}
	public String getCancellationRemark(){
		return this.cancellationRemark;
	}
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}