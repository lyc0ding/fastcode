package org.lycoding.service;
import org.lycoding.entity.po.SysRoleDept;

/**
* @description 角色和部门关联表
*
* @author Tom
* @date 2024-12-16
**/
public interface SysRoleDeptService{

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	public Object insert (SysRoleDept sysRoleDept);

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	public Object deleteById ( Long id );

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	public Object getById ( Long id );

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	public Object getList ();

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	public Object updateById ( Long id );

}