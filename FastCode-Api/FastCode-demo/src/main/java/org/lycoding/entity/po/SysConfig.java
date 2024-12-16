package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 参数配置表
*
* @author Tom
* @date 2024-12-16
**/
public class SysConfig{
	/** 参数主键 */
	private String configId;

	/** 参数名称 */
	private String configName;

	/** 参数键名 */
	private String configKey;

	/** 参数键值 */
	private String configValue;

	/** 系统内置（Y是 N否） */
	private String configType;

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
	public void setConfigId(String configId){
		this.configId=configId;
	}
	public String getConfigId(){
		return this.configId;
	}
	public void setConfigName(String configName){
		this.configName=configName;
	}
	public String getConfigName(){
		return this.configName;
	}
	public void setConfigKey(String configKey){
		this.configKey=configKey;
	}
	public String getConfigKey(){
		return this.configKey;
	}
	public void setConfigValue(String configValue){
		this.configValue=configValue;
	}
	public String getConfigValue(){
		return this.configValue;
	}
	public void setConfigType(String configType){
		this.configType=configType;
	}
	public String getConfigType(){
		return this.configType;
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