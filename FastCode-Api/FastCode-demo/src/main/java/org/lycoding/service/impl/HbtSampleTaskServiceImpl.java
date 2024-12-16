package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleTaskService;
import org.lycoding.mapper.HbtSampleTaskMapper;
import org.lycoding.entity.po.HbtSampleTask;

/**
* @description 采样任务信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleTaskServiceImpl implements HbtSampleTaskService{
	@Autowired
	private HbtSampleTaskMapper hbtSampleTaskMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleTask hbtSampleTask){
		hbtSampleTaskMapper.insert( hbtSampleTask);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleTaskMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleTaskMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleTaskMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleTaskMapper.getById( id );
		return null;
	}
}