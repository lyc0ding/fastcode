package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 样品交接记录子表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleHandoverItem{
	/**  */
	private String itemId;

	/** 关联主表主键 */
	private String handoverId;

	/** 关联样品主键 */
	private String sampleId;

	/** 样品数量 */
	private String sampleAmount;

	/** 保存方式 */
	private String saveWay;

	/** 重量是否符合 */
	private String isWeightIntact;

	/** 包装是否完好 */
	private String isPackingIntact;

	/** 标签是否整洁 */
	private String isTagIntact;

	/** 接收状态 */
	private String state;

	/** 创建时间 */
	private Date createTime;

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setItemId(String itemId){
		this.itemId=itemId;
	}
	public String getItemId(){
		return this.itemId;
	}
	public void setHandoverId(String handoverId){
		this.handoverId=handoverId;
	}
	public String getHandoverId(){
		return this.handoverId;
	}
	public void setSampleId(String sampleId){
		this.sampleId=sampleId;
	}
	public String getSampleId(){
		return this.sampleId;
	}
	public void setSampleAmount(String sampleAmount){
		this.sampleAmount=sampleAmount;
	}
	public String getSampleAmount(){
		return this.sampleAmount;
	}
	public void setSaveWay(String saveWay){
		this.saveWay=saveWay;
	}
	public String getSaveWay(){
		return this.saveWay;
	}
	public void setIsWeightIntact(String isWeightIntact){
		this.isWeightIntact=isWeightIntact;
	}
	public String getIsWeightIntact(){
		return this.isWeightIntact;
	}
	public void setIsPackingIntact(String isPackingIntact){
		this.isPackingIntact=isPackingIntact;
	}
	public String getIsPackingIntact(){
		return this.isPackingIntact;
	}
	public void setIsTagIntact(String isTagIntact){
		this.isTagIntact=isTagIntact;
	}
	public String getIsTagIntact(){
		return this.isTagIntact;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}