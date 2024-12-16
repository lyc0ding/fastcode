package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtMonitorTaskPointService;
import org.lycoding.mapper.HbtMonitorTaskPointMapper;
import org.lycoding.entity.po.HbtMonitorTaskPoint;

/**
* @description 监测任务和点位关联表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtMonitorTaskPointServiceImpl implements HbtMonitorTaskPointService{
	@Autowired
	private HbtMonitorTaskPointMapper hbtMonitorTaskPointMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtMonitorTaskPoint hbtMonitorTaskPoint){
		hbtMonitorTaskPointMapper.insert( hbtMonitorTaskPoint);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtMonitorTaskPointMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtMonitorTaskPointMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtMonitorTaskPointMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtMonitorTaskPointMapper.getById( id );
		return null;
	}
}