package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtPointInfo{
	/** 点位ID */
	private String pointId;

	/** 关联监测项目id; */
	private String projectId;

	/** 点位编号 */
	private String pointCode;

	/** 点位名称 */
	private String name;

	/** 点位详细地址 */
	private String address;

	/** 点位类型 */
	private String pointType;

	/** 样品类型 */
	private String sampleKinds;

	/** 市 */
	private String city;

	/** 县 */
	private String county;

	/** 镇 */
	private String town;

	/** 村 */
	private String burg;

	/** 已分配任务次数 */
	private String taskCount;

	/** GPS经度 */
	private String gpsLongitude;

	/** GPS纬度 */
	private String gpsLatitude;

	/** 高德经度 */
	private String amapLongitude;

	/** 高德纬度 */
	private String amapLatitude;

	/** 企业名称 */
	private String enterprise;

	/** 企业类型 */
	private String enterpriseType;

	/** 行业类型 */
	private String industryType;

	/** 是否是室间平行点位 0 否 1是
  */
	private String roomParallel;

	/** 是否是平行点位 0 否 1 是 */
	private String pointParallel;

	/** 0-正常；1-作废 */
	private String invalid;

	/** 删除标志（0代表存在 2代表删除） */
	private String delFlag;

	/** 备注 */
	private String remark;

	/** 创建者 */
	private String createBy;

	/** 创建时间 */
	private Date createTime;

	/** 更新者 */
	private String updateBy;

	/** 更新时间 */
	private Date updateTime;

	/**  */
	private String isTransfer;

	/** setter、getter方法 */
	public void setPointId(String pointId){
		this.pointId=pointId;
	}
	public String getPointId(){
		return this.pointId;
	}
	public void setProjectId(String projectId){
		this.projectId=projectId;
	}
	public String getProjectId(){
		return this.projectId;
	}
	public void setPointCode(String pointCode){
		this.pointCode=pointCode;
	}
	public String getPointCode(){
		return this.pointCode;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setPointType(String pointType){
		this.pointType=pointType;
	}
	public String getPointType(){
		return this.pointType;
	}
	public void setSampleKinds(String sampleKinds){
		this.sampleKinds=sampleKinds;
	}
	public String getSampleKinds(){
		return this.sampleKinds;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return this.city;
	}
	public void setCounty(String county){
		this.county=county;
	}
	public String getCounty(){
		return this.county;
	}
	public void setTown(String town){
		this.town=town;
	}
	public String getTown(){
		return this.town;
	}
	public void setBurg(String burg){
		this.burg=burg;
	}
	public String getBurg(){
		return this.burg;
	}
	public void setTaskCount(String taskCount){
		this.taskCount=taskCount;
	}
	public String getTaskCount(){
		return this.taskCount;
	}
	public void setGpsLongitude(String gpsLongitude){
		this.gpsLongitude=gpsLongitude;
	}
	public String getGpsLongitude(){
		return this.gpsLongitude;
	}
	public void setGpsLatitude(String gpsLatitude){
		this.gpsLatitude=gpsLatitude;
	}
	public String getGpsLatitude(){
		return this.gpsLatitude;
	}
	public void setAmapLongitude(String amapLongitude){
		this.amapLongitude=amapLongitude;
	}
	public String getAmapLongitude(){
		return this.amapLongitude;
	}
	public void setAmapLatitude(String amapLatitude){
		this.amapLatitude=amapLatitude;
	}
	public String getAmapLatitude(){
		return this.amapLatitude;
	}
	public void setEnterprise(String enterprise){
		this.enterprise=enterprise;
	}
	public String getEnterprise(){
		return this.enterprise;
	}
	public void setEnterpriseType(String enterpriseType){
		this.enterpriseType=enterpriseType;
	}
	public String getEnterpriseType(){
		return this.enterpriseType;
	}
	public void setIndustryType(String industryType){
		this.industryType=industryType;
	}
	public String getIndustryType(){
		return this.industryType;
	}
	public void setRoomParallel(String roomParallel){
		this.roomParallel=roomParallel;
	}
	public String getRoomParallel(){
		return this.roomParallel;
	}
	public void setPointParallel(String pointParallel){
		this.pointParallel=pointParallel;
	}
	public String getPointParallel(){
		return this.pointParallel;
	}
	public void setInvalid(String invalid){
		this.invalid=invalid;
	}
	public String getInvalid(){
		return this.invalid;
	}
	public void setDelFlag(String delFlag){
		this.delFlag=delFlag;
	}
	public String getDelFlag(){
		return this.delFlag;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
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