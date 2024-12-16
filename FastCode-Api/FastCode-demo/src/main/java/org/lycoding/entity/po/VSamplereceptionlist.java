package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
public class VSamplereceptionlist{
	/** 主键 */
	private String sampleId;

	/** 样品采集ID */
	private String collectionId;

	/**  */
	private String firmName;

	/**  */
	private String samplingVolume;

	/**  */
	private String samplingWeight;

	/**  */
	private String kindName;

	/** 采样任务编号 */
	private String sampleTaskCode;

	/** 样品编号 */
	private String sampleCode;

	/** 样品种类 */
	private String sampleKinds;

	/** 样品类型：0-空白样，1-原样，2-平行样，3-标准样 */
	private String sampleType;

	/** 关联分析项目  */
	private String analysisProject;

	/** 0-室内平行 1-室间平行 */
	private String roomParallel;

	/** 平行样 0-否  1-是 */
	private String sampleParallel;

	/** 采样日期 */
	private Date samplingTime;

	/** 交接编号/包号 */
	private String handoverCode;

	/** 交接状态 0-初始态 1检测单位已接收 */
	private String status;

	/**  */
	private String deptName;

	/**  */
	private String sender;

	/** 送样时间 */
	private Date sendingTime;

	/**  */
	private String receiver;

	/** 接样时间 */
	private Date receiveTime;

	/** 关联监测项目id; */
	private String projectId;

	/** setter、getter方法 */
	public void setSampleId(String sampleId){
		this.sampleId=sampleId;
	}
	public String getSampleId(){
		return this.sampleId;
	}
	public void setCollectionId(String collectionId){
		this.collectionId=collectionId;
	}
	public String getCollectionId(){
		return this.collectionId;
	}
	public void setFirmName(String firmName){
		this.firmName=firmName;
	}
	public String getFirmName(){
		return this.firmName;
	}
	public void setSamplingVolume(String samplingVolume){
		this.samplingVolume=samplingVolume;
	}
	public String getSamplingVolume(){
		return this.samplingVolume;
	}
	public void setSamplingWeight(String samplingWeight){
		this.samplingWeight=samplingWeight;
	}
	public String getSamplingWeight(){
		return this.samplingWeight;
	}
	public void setKindName(String kindName){
		this.kindName=kindName;
	}
	public String getKindName(){
		return this.kindName;
	}
	public void setSampleTaskCode(String sampleTaskCode){
		this.sampleTaskCode=sampleTaskCode;
	}
	public String getSampleTaskCode(){
		return this.sampleTaskCode;
	}
	public void setSampleCode(String sampleCode){
		this.sampleCode=sampleCode;
	}
	public String getSampleCode(){
		return this.sampleCode;
	}
	public void setSampleKinds(String sampleKinds){
		this.sampleKinds=sampleKinds;
	}
	public String getSampleKinds(){
		return this.sampleKinds;
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
	public void setRoomParallel(String roomParallel){
		this.roomParallel=roomParallel;
	}
	public String getRoomParallel(){
		return this.roomParallel;
	}
	public void setSampleParallel(String sampleParallel){
		this.sampleParallel=sampleParallel;
	}
	public String getSampleParallel(){
		return this.sampleParallel;
	}
	public void setSamplingTime(Date samplingTime){
		this.samplingTime=samplingTime;
	}
	public Date getSamplingTime(){
		return this.samplingTime;
	}
	public void setHandoverCode(String handoverCode){
		this.handoverCode=handoverCode;
	}
	public String getHandoverCode(){
		return this.handoverCode;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setDeptName(String deptName){
		this.deptName=deptName;
	}
	public String getDeptName(){
		return this.deptName;
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
	public void setReceiver(String receiver){
		this.receiver=receiver;
	}
	public String getReceiver(){
		return this.receiver;
	}
	public void setReceiveTime(Date receiveTime){
		this.receiveTime=receiveTime;
	}
	public Date getReceiveTime(){
		return this.receiveTime;
	}
	public void setProjectId(String projectId){
		this.projectId=projectId;
	}
	public String getProjectId(){
		return this.projectId;
	}

}