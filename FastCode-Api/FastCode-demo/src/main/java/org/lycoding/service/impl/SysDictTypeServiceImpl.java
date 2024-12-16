package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysDictTypeService;
import org.lycoding.mapper.SysDictTypeMapper;
import org.lycoding.entity.po.SysDictType;

/**
* @description 字典类型表
*
* @author Tom
* @date 2024-12-16
**/
public class SysDictTypeServiceImpl implements SysDictTypeService{
	@Autowired
	private SysDictTypeMapper sysDictTypeMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysDictType sysDictType){
		sysDictTypeMapper.insert( sysDictType);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysDictTypeMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysDictTypeMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysDictTypeMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysDictTypeMapper.getById( id );
		return null;
	}
}