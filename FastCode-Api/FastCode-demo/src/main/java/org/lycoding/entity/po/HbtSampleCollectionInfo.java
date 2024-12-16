package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleCollectionInfo{
	/** 样品采集ID */
	private String collectionId;

	/** 采样任务ID */
	private String sampletaskId;

	/** 采样内容 */
	private String content;

	/** 照片id列表 */
	private String imgList;

	/** 删除标准(0的代表存在 2代表删除) */
	private String delFlag;

	/** 创建人 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新人 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/** 本地样品采集表示ID */
	private String localhostId;

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setCollectionId(String collectionId){
		this.collectionId=collectionId;
	}
	public String getCollectionId(){
		return this.collectionId;
	}
	public void setSampletaskId(String sampletaskId){
		this.sampletaskId=sampletaskId;
	}
	public String getSampletaskId(){
		return this.sampletaskId;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
	public void setImgList(String imgList){
		this.imgList=imgList;
	}
	public String getImgList(){
		return this.imgList;
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
	public void setLocalhostId(String localhostId){
		this.localhostId=localhostId;
	}
	public String getLocalhostId(){
		return this.localhostId;
	}
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}