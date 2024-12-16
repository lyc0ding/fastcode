package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description app版本;https://ext.dcloud.net.cn/plugin?id=7286
*
* @author Tom
* @date 2024-12-16
**/
public class HbtAppVersion{
	/** 主键 */
	private String id;

	/** 版本号 最重要的manifest里的版本号 （检查更新主要以服务器返回的edition_number版本号是否大于当前app的版本号来实现是否更新） */
	private String editionNumber;

	/** 版本名称 manifest里的版本名称 */
	private String editionName;

	/** 平台类型：android, ios */
	private String platformType;

	/** 0是整包升级（apk或者appstore或者安卓应用市场） 1是wgt升级 */
	private String packageType;

	/** 是否发行  0否 1是 为了控制上架应用市场审核时不能弹出热更新框 */
	private String editionIssue;

	/** 是否静默更新 0代表否 1代表是 */
	private String editionSilence;

	/** 是否强制更新 0代表否 1代表是 */
	private String editionForce;

	/** apk、wgt包下载地址或者应用市场地址  安卓应用市场 market://details?id=xxxx 苹果store itms-apps://itunes.apple.com/cn/app/xxxxxx */
	private String editionUrl;

	/** 版本更新内容;支持<br>自动换行 */
	private String describe;

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

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setEditionNumber(String editionNumber){
		this.editionNumber=editionNumber;
	}
	public String getEditionNumber(){
		return this.editionNumber;
	}
	public void setEditionName(String editionName){
		this.editionName=editionName;
	}
	public String getEditionName(){
		return this.editionName;
	}
	public void setPlatformType(String platformType){
		this.platformType=platformType;
	}
	public String getPlatformType(){
		return this.platformType;
	}
	public void setPackageType(String packageType){
		this.packageType=packageType;
	}
	public String getPackageType(){
		return this.packageType;
	}
	public void setEditionIssue(String editionIssue){
		this.editionIssue=editionIssue;
	}
	public String getEditionIssue(){
		return this.editionIssue;
	}
	public void setEditionSilence(String editionSilence){
		this.editionSilence=editionSilence;
	}
	public String getEditionSilence(){
		return this.editionSilence;
	}
	public void setEditionForce(String editionForce){
		this.editionForce=editionForce;
	}
	public String getEditionForce(){
		return this.editionForce;
	}
	public void setEditionUrl(String editionUrl){
		this.editionUrl=editionUrl;
	}
	public String getEditionUrl(){
		return this.editionUrl;
	}
	public void setDescribe(String describe){
		this.describe=describe;
	}
	public String getDescribe(){
		return this.describe;
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

}