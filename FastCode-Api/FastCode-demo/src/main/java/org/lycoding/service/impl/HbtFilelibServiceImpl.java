package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtFilelibService;
import org.lycoding.mapper.HbtFilelibMapper;
import org.lycoding.entity.po.HbtFilelib;

/**
* @description 文件信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtFilelibServiceImpl implements HbtFilelibService{
	@Autowired
	private HbtFilelibMapper hbtFilelibMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtFilelib hbtFilelib){
		hbtFilelibMapper.insert( hbtFilelib);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtFilelibMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtFilelibMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtFilelibMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtFilelibMapper.getById( id );
		return null;
	}
}