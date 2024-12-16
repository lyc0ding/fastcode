package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 操作日志记录
*
* @author Tom
* @date 2024-12-16
**/
public class SysOperLog{
	/** 日志主键 */
	private String operId;

	/** 模块标题 */
	private String title;

	/** 业务类型（0其它 1新增 2修改 3删除） */
	private String businessType;

	/** 方法名称 */
	private String method;

	/** 请求方式 */
	private String requestMethod;

	/** 操作类别（0其它 1后台用户 2手机端用户） */
	private String operatorType;

	/** 操作人员 */
	private String operName;

	/** 部门名称 */
	private String deptName;

	/** 请求URL */
	private String operUrl;

	/** 主机地址 */
	private String operIp;

	/** 操作地点 */
	private String operLocation;

	/** 请求参数 */
	private String operParam;

	/** 返回参数 */
	private String jsonResult;

	/** 操作状态（0正常 1异常） */
	private String status;

	/** 错误消息 */
	private String errorMsg;

	/** 操作时间 */
	private Date operTime;

	/** 消耗时间 */
	private String costTime;

	/** setter、getter方法 */
	public void setOperId(String operId){
		this.operId=operId;
	}
	public String getOperId(){
		return this.operId;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setBusinessType(String businessType){
		this.businessType=businessType;
	}
	public String getBusinessType(){
		return this.businessType;
	}
	public void setMethod(String method){
		this.method=method;
	}
	public String getMethod(){
		return this.method;
	}
	public void setRequestMethod(String requestMethod){
		this.requestMethod=requestMethod;
	}
	public String getRequestMethod(){
		return this.requestMethod;
	}
	public void setOperatorType(String operatorType){
		this.operatorType=operatorType;
	}
	public String getOperatorType(){
		return this.operatorType;
	}
	public void setOperName(String operName){
		this.operName=operName;
	}
	public String getOperName(){
		return this.operName;
	}
	public void setDeptName(String deptName){
		this.deptName=deptName;
	}
	public String getDeptName(){
		return this.deptName;
	}
	public void setOperUrl(String operUrl){
		this.operUrl=operUrl;
	}
	public String getOperUrl(){
		return this.operUrl;
	}
	public void setOperIp(String operIp){
		this.operIp=operIp;
	}
	public String getOperIp(){
		return this.operIp;
	}
	public void setOperLocation(String operLocation){
		this.operLocation=operLocation;
	}
	public String getOperLocation(){
		return this.operLocation;
	}
	public void setOperParam(String operParam){
		this.operParam=operParam;
	}
	public String getOperParam(){
		return this.operParam;
	}
	public void setJsonResult(String jsonResult){
		this.jsonResult=jsonResult;
	}
	public String getJsonResult(){
		return this.jsonResult;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setErrorMsg(String errorMsg){
		this.errorMsg=errorMsg;
	}
	public String getErrorMsg(){
		return this.errorMsg;
	}
	public void setOperTime(Date operTime){
		this.operTime=operTime;
	}
	public Date getOperTime(){
		return this.operTime;
	}
	public void setCostTime(String costTime){
		this.costTime=costTime;
	}
	public String getCostTime(){
		return this.costTime;
	}

}