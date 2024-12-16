package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtResampleTaskService;
import org.lycoding.mapper.HbtResampleTaskMapper;
import org.lycoding.entity.po.HbtResampleTask;

/**
* @description 重采任务表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtResampleTaskServiceImpl implements HbtResampleTaskService{
	@Autowired
	private HbtResampleTaskMapper hbtResampleTaskMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtResampleTask hbtResampleTask){
		hbtResampleTaskMapper.insert( hbtResampleTask);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtResampleTaskMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtResampleTaskMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtResampleTaskMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtResampleTaskMapper.getById( id );
		return null;
	}
}