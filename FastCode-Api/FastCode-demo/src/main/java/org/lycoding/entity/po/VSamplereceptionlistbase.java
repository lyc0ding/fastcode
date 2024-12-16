package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
public class VSamplereceptionlistbase{
	/** 关联样品主键 */
	private String sampleId;

	/** 交接编号/包号 */
	private String handoverCode;

	/** 交接部门id */
	private String handoverDeptId;

	/** 关联项目id */
	private String projectId;

	/** 送样人主键 */
	private String senderId;

	/** 送样时间 */
	private Date senderTime;

	/** 接样人主键 */
	private String receiverId;

	/** 接样时间 */
	private Date receiveTime;

	/** 交接状态 0-初始态 1检测单位已接收 */
	private String status;

	/**  */
	private String itemId;

	/** 交接记录类型  0-初步交接记录   1-流转记录 2-正式交接记录 */
	private String recordType;

	/** setter、getter方法 */
	public void setSampleId(String sampleId){
		this.sampleId=sampleId;
	}
	public String getSampleId(){
		return this.sampleId;
	}
	public void setHandoverCode(String handoverCode){
		this.handoverCode=handoverCode;
	}
	public String getHandoverCode(){
		return this.handoverCode;
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
	public void setSenderId(String senderId){
		this.senderId=senderId;
	}
	public String getSenderId(){
		return this.senderId;
	}
	public void setSenderTime(Date senderTime){
		this.senderTime=senderTime;
	}
	public Date getSenderTime(){
		return this.senderTime;
	}
	public void setReceiverId(String receiverId){
		this.receiverId=receiverId;
	}
	public String getReceiverId(){
		return this.receiverId;
	}
	public void setReceiveTime(Date receiveTime){
		this.receiveTime=receiveTime;
	}
	public Date getReceiveTime(){
		return this.receiveTime;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setItemId(String itemId){
		this.itemId=itemId;
	}
	public String getItemId(){
		return this.itemId;
	}
	public void setRecordType(String recordType){
		this.recordType=recordType;
	}
	public String getRecordType(){
		return this.recordType;
	}

}