package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 岗位信息表
*
* @author Tom
* @date 2024-12-16
**/
public class SysPost{
	/** 岗位ID */
	private String postId;

	/** 岗位编码 */
	private String postCode;

	/** 岗位名称 */
	private String postName;

	/** 显示顺序 */
	private String postSort;

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
	public void setPostId(String postId){
		this.postId=postId;
	}
	public String getPostId(){
		return this.postId;
	}
	public void setPostCode(String postCode){
		this.postCode=postCode;
	}
	public String getPostCode(){
		return this.postCode;
	}
	public void setPostName(String postName){
		this.postName=postName;
	}
	public String getPostName(){
		return this.postName;
	}
	public void setPostSort(String postSort){
		this.postSort=postSort;
	}
	public String getPostSort(){
		return this.postSort;
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