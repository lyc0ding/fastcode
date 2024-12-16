package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtAreaService;
import org.lycoding.mapper.HbtAreaMapper;
import org.lycoding.entity.po.HbtArea;

/**
* @description 地区编码表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtAreaServiceImpl implements HbtAreaService{
	@Autowired
	private HbtAreaMapper hbtAreaMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtArea hbtArea){
		hbtAreaMapper.insert( hbtArea);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtAreaMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtAreaMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtAreaMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtAreaMapper.getById( id );
		return null;
	}
}