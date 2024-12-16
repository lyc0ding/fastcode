package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtProjectService;
import org.lycoding.mapper.HbtProjectMapper;
import org.lycoding.entity.po.HbtProject;

/**
* @description 监测项目表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtProjectServiceImpl implements HbtProjectService{
	@Autowired
	private HbtProjectMapper hbtProjectMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtProject hbtProject){
		hbtProjectMapper.insert( hbtProject);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtProjectMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtProjectMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtProjectMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtProjectMapper.getById( id );
		return null;
	}
}