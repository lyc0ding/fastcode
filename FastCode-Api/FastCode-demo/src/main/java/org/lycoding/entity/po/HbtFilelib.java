package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 文件信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtFilelib{
	/** 文件id */
	private String id;

	/** 文件原始名称 */
	private String fileName;

	/** 文件别名(非中文) */
	private String fileAliasName;

	/** 文件类型 */
	private String fileType;

	/** 父级文件id */
	private String parentId;

	/** 所属菜单ID */
	private String menuId;

	/** 0-文档中心 1-监测任务 */
	private String menuType;

	/** 类型：0-文件，1-文件夹 */
	private String documentType;

	/** 创建人 */
	private String createBy;

	/** 修改人 */
	private String updateBy;

	/** 文件路径 */
	private String filePath;

	/** 创建时间：yyyy-MM-dd HH:mm:ss */
	private Date createTime;

	/** 修改时间：yyyy-MM-dd HH:mm:ss */
	private Date updateTime;

	/** 删除标识：0-未删除，1-已删除 */
	private String deleted;

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setFileName(String fileName){
		this.fileName=fileName;
	}
	public String getFileName(){
		return this.fileName;
	}
	public void setFileAliasName(String fileAliasName){
		this.fileAliasName=fileAliasName;
	}
	public String getFileAliasName(){
		return this.fileAliasName;
	}
	public void setFileType(String fileType){
		this.fileType=fileType;
	}
	public String getFileType(){
		return this.fileType;
	}
	public void setParentId(String parentId){
		this.parentId=parentId;
	}
	public String getParentId(){
		return this.parentId;
	}
	public void setMenuId(String menuId){
		this.menuId=menuId;
	}
	public String getMenuId(){
		return this.menuId;
	}
	public void setMenuType(String menuType){
		this.menuType=menuType;
	}
	public String getMenuType(){
		return this.menuType;
	}
	public void setDocumentType(String documentType){
		this.documentType=documentType;
	}
	public String getDocumentType(){
		return this.documentType;
	}
	public void setCreateBy(String createBy){
		this.createBy=createBy;
	}
	public String getCreateBy(){
		return this.createBy;
	}
	public void setUpdateBy(String updateBy){
		this.updateBy=updateBy;
	}
	public String getUpdateBy(){
		return this.updateBy;
	}
	public void setFilePath(String filePath){
		this.filePath=filePath;
	}
	public String getFilePath(){
		return this.filePath;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setDeleted(String deleted){
		this.deleted=deleted;
	}
	public String getDeleted(){
		return this.deleted;
	}

}