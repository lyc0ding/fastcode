package org.lycoding.entity.po;

import java.sql.Date;

public class Dept{
	//部门id
	private Integer deptId;
	//部门名
	private String deptName;
	//部门领导
	private Integer deptLeader;
	//创建时间
	private Date createTime;
	//0：存在  1：删除
	private String status;
}
