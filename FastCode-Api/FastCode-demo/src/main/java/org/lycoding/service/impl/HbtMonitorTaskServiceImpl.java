package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtMonitorTaskService;
import org.lycoding.mapper.HbtMonitorTaskMapper;
import org.lycoding.entity.po.HbtMonitorTask;

/**
* @description 监测任务表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtMonitorTaskServiceImpl implements HbtMonitorTaskService{
	@Autowired
	private HbtMonitorTaskMapper hbtMonitorTaskMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtMonitorTask hbtMonitorTask){
		hbtMonitorTaskMapper.insert( hbtMonitorTask);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtMonitorTaskMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtMonitorTaskMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtMonitorTaskMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtMonitorTaskMapper.getById( id );
		return null;
	}
}