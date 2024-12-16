package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 字典类型表
*
* @author Tom
* @date 2024-12-16
**/
public class SysDictType{
	/** 字典主键 */
	private String dictId;

	/** 字典名称 */
	private String dictName;

	/** 字典类型 */
	private String dictType;

	/** 状态（0正常 1停用） */
	private String status;

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
	public void setDictId(String dictId){
		this.dictId=dictId;
	}
	public String getDictId(){
		return this.dictId;
	}
	public void setDictName(String dictName){
		this.dictName=dictName;
	}
	public String getDictName(){
		return this.dictName;
	}
	public void setDictType(String dictType){
		this.dictType=dictType;
	}
	public String getDictType(){
		return this.dictType;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
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