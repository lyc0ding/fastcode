package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 通知公告表
*
* @author Tom
* @date 2024-12-16
**/
public class SysNotice{
	/** 公告ID */
	private String noticeId;

	/** 公告标题 */
	private String noticeTitle;

	/** 公告类型（1通知 2公告） */
	private String noticeType;

	/** 公告内容 */
	private String noticeContent;

	/** 公告状态（0正常 1关闭） */
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
	public void setNoticeId(String noticeId){
		this.noticeId=noticeId;
	}
	public String getNoticeId(){
		return this.noticeId;
	}
	public void setNoticeTitle(String noticeTitle){
		this.noticeTitle=noticeTitle;
	}
	public String getNoticeTitle(){
		return this.noticeTitle;
	}
	public void setNoticeType(String noticeType){
		this.noticeType=noticeType;
	}
	public String getNoticeType(){
		return this.noticeType;
	}
	public void setNoticeContent(String noticeContent){
		this.noticeContent=noticeContent;
	}
	public String getNoticeContent(){
		return this.noticeContent;
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