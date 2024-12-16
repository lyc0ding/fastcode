package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleCollectionMiddle{
	/** 采样中间表ID */
	private String middleId;

	/** 采样父表ID */
	private String collectionId;

	/** 采样内容 */
	private String content;

	/** 备注 */
	private String remark;

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

	/** setter、getter方法 */
	public void setMiddleId(String middleId){
		this.middleId=middleId;
	}
	public String getMiddleId(){
		return this.middleId;
	}
	public void setCollectionId(String collectionId){
		this.collectionId=collectionId;
	}
	public String getCollectionId(){
		return this.collectionId;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
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

}