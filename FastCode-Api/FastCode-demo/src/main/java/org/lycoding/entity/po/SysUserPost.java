package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 用户与岗位关联表
*
* @author Tom
* @date 2024-12-16
**/
public class SysUserPost{
	/** 用户ID */
	private String userId;

	/** 岗位ID */
	private String postId;

	/** setter、getter方法 */
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setPostId(String postId){
		this.postId=postId;
	}
	public String getPostId(){
		return this.postId;
	}

}