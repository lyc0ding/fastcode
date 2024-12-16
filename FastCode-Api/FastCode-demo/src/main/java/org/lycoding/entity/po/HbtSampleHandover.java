package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 样品交接记录表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleHandover{
	/** 交接记录主键 */
	private String handoverId;

	/** 交接编号/包号 */
	private String handoverCode;

	/** 创建部门id */
	private String deptId;

	/** 交接部门id */
	private String handoverDeptId;

	/** 关联项目id */
	private String projectId;

	/** 质控样数量 */
	private String sampleNumber;

	/** 送样人主键 */
	private String senderId;

	/** 接样人主键 */
	private String receiverId;

	/** 创建人主键 */
	private String userId;

	/** 送样时间 */
	private Date senderTime;

	/** 接样时间 */
	private Date receiveTime;

	/** 交接记录类型  0-初步交接记录   1-流转记录 2-正式交接记录 */
	private String recordType;

	/** 交接状态 0-初始态 1检测单位已接收 */
	private String status;

	/** 作废标志 */
	private String invalid;

	/** 备注 */
	private String remark;

	/** 样品流转审核状态 */
	private String reviewStatus;

	/** 审核说明 */
	private String reviewContent;

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

	/**  */
	private String isTransfer;

	/** 质控样数量 */
	private String qcSample;

	/** setter、getter方法 */
	public void setHandoverId(String handoverId){
		this.handoverId=handoverId;
	}
	public String getHandoverId(){
		return this.handoverId;
	}
	public void setHandoverCode(String handoverCode){
		this.handoverCode=handoverCode;
	}
	public String getHandoverCode(){
		return this.handoverCode;
	}
	public void setDeptId(String deptId){
		this.deptId=deptId;
	}
	public String getDeptId(){
		return this.deptId;
	}
	public void setHandoverDeptId(String handoverDeptId){
		this.handoverDeptId=handoverDeptId;
	}
	public String getHandoverDeptId(){
		return this.handoverDeptId;
	}
	public void setProjectId(String projectId){
		this.projectId=projectId;
	}
	public String getProjectId(){
		return this.projectId;
	}
	public void setSampleNumber(String sampleNumber){
		this.sampleNumber=sampleNumber;
	}
	public String getSampleNumber(){
		return this.sampleNumber;
	}
	public void setSenderId(String senderId){
		this.senderId=senderId;
	}
	public String getSenderId(){
		return this.senderId;
	}
	public void setReceiverId(String receiverId){
		this.receiverId=receiverId;
	}
	public String getReceiverId(){
		return this.receiverId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setSenderTime(Date senderTime){
		this.senderTime=senderTime;
	}
	public Date getSenderTime(){
		return this.senderTime;
	}
	public void setReceiveTime(Date receiveTime){
		this.receiveTime=receiveTime;
	}
	public Date getReceiveTime(){
		return this.receiveTime;
	}
	public void setRecordType(String recordType){
		this.recordType=recordType;
	}
	public String getRecordType(){
		return this.recordType;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setInvalid(String invalid){
		this.invalid=invalid;
	}
	public String getInvalid(){
		return this.invalid;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setReviewStatus(String reviewStatus){
		this.reviewStatus=reviewStatus;
	}
	public String getReviewStatus(){
		return this.reviewStatus;
	}
	public void setReviewContent(String reviewContent){
		this.reviewContent=reviewContent;
	}
	public String getReviewContent(){
		return this.reviewContent;
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
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}
	public void setQcSample(String qcSample){
		this.qcSample=qcSample;
	}
	public String getQcSample(){
		return this.qcSample;
	}

}