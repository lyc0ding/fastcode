package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 存储的悲观锁信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzLocks{
	/** 调度名称 */
	private String schedName;

	/** 悲观锁名称 */
	private String lockName;

	/** setter、getter方法 */
	public void setSchedName(String schedName){
		this.schedName=schedName;
	}
	public String getSchedName(){
		return this.schedName;
	}
	public void setLockName(String lockName){
		this.lockName=lockName;
	}
	public String getLockName(){
		return this.lockName;
	}

}