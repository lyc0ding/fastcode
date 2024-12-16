package org.lycoding.service;
import org.lycoding.entity.po.QrtzSchedulerState;

/**
* @description 调度器状态表
*
* @author Tom
* @date 2024-12-16
**/
public interface QrtzSchedulerStateService{

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	public Object insert (QrtzSchedulerState qrtzSchedulerState);

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