package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 地区编码表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtArea{
	/** 地区Id */
	private String id;

	/** 地区编码 */
	private String areaCode;

	/** 地区名 */
	private String areaName;

	/** 地区级别（2:市city,3:区县district,4:街道street） */
	private String level;

	/** 地区父节点编码 */
	private String parentCode;

	/** 地区状态 */
	private String status;

	/** 点位编码当前值 */
	private String initialValue;

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

	/** 备注 */
	private String remark;

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setAreaCode(String areaCode){
		this.areaCode=areaCode;
	}
	public String getAreaCode(){
		return this.areaCode;
	}
	public void setAreaName(String areaName){
		this.areaName=areaName;
	}
	public String getAreaName(){
		return this.areaName;
	}
	public void setLevel(String level){
		this.level=level;
	}
	public String getLevel(){
		return this.level;
	}
	public void setParentCode(String parentCode){
		this.parentCode=parentCode;
	}
	public String getParentCode(){
		return this.parentCode;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setInitialValue(String initialValue){
		this.initialValue=initialValue;
	}
	public String getInitialValue(){
		return this.initialValue;
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