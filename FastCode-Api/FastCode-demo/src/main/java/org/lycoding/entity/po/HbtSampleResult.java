package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 样品采集信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleResult{
	/** 主键;样品采集信息主键 */
	private String resultId;

	/** 样品主键 */
	private String sampleId;

	/** 采样内容（用json存储）;根据不同样品类型存储采样结果 */
	private String content;

	/** 采样人（json数组存储用户id） */
	private String sampler;

	/** 采样时间 */
	private Date samplingTime;

	/** 送样人 */
	private String sender;

	/** 送样日期 */
	private Date sendingTime;

	/** 接样人 */
	private String hander;

	/** 接样日期 */
	private String handingTime;

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

	/** setter、getter方法 */
	public void setResultId(String resultId){
		this.resultId=resultId;
	}
	public String getResultId(){
		return this.resultId;
	}
	public void setSampleId(String sampleId){
		this.sampleId=sampleId;
	}
	public String getSampleId(){
		return this.sampleId;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
	public void setSampler(String sampler){
		this.sampler=sampler;
	}
	public String getSampler(){
		return this.sampler;
	}
	public void setSamplingTime(Date samplingTime){
		this.samplingTime=samplingTime;
	}
	public Date getSamplingTime(){
		return this.samplingTime;
	}
	public void setSender(String sender){
		this.sender=sender;
	}
	public String getSender(){
		return this.sender;
	}
	public void setSendingTime(Date sendingTime){
		this.sendingTime=sendingTime;
	}
	public Date getSendingTime(){
		return this.sendingTime;
	}
	public void setHander(String hander){
		this.hander=hander;
	}
	public String getHander(){
		return this.hander;
	}
	public void setHandingTime(String handingTime){
		this.handingTime=handingTime;
	}
	public String getHandingTime(){
		return this.handingTime;
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