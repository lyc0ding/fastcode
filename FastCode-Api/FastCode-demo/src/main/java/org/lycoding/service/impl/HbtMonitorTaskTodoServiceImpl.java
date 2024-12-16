package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtMonitorTaskTodoService;
import org.lycoding.mapper.HbtMonitorTaskTodoMapper;
import org.lycoding.entity.po.HbtMonitorTaskTodo;

/**
* @description 监测任务待办
*
* @author Tom
* @date 2024-12-16
**/
public class HbtMonitorTaskTodoServiceImpl implements HbtMonitorTaskTodoService{
	@Autowired
	private HbtMonitorTaskTodoMapper hbtMonitorTaskTodoMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtMonitorTaskTodo hbtMonitorTaskTodo){
		hbtMonitorTaskTodoMapper.insert( hbtMonitorTaskTodo);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtMonitorTaskTodoMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtMonitorTaskTodoMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtMonitorTaskTodoMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtMonitorTaskTodoMapper.getById( id );
		return null;
	}
}