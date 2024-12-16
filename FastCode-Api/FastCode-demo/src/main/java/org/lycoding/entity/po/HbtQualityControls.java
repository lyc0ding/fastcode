package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 证书信息主表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQualityControls{
	/** 证书编号主键 */
	private String qualityId;

	/** 证书编号 */
	private String certificateCode;

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

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setQualityId(String qualityId){
		this.qualityId=qualityId;
	}
	public String getQualityId(){
		return this.qualityId;
	}
	public void setCertificateCode(String certificateCode){
		this.certificateCode=certificateCode;
	}
	public String getCertificateCode(){
		return this.certificateCode;
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
	public void setIsTransfer(String isTransfer){
		this.isTransfer=isTransfer;
	}
	public String getIsTransfer(){
		return this.isTransfer;
	}

}