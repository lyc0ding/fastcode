package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.GenTableService;
import org.lycoding.mapper.GenTableMapper;
import org.lycoding.entity.po.GenTable;

/**
* @description 代码生成业务表
*
* @author Tom
* @date 2024-12-16
**/
public class GenTableServiceImpl implements GenTableService{
	@Autowired
	private GenTableMapper genTableMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (GenTable genTable){
		genTableMapper.insert( genTable);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		genTableMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		genTableMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		genTableMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		genTableMapper.getById( id );
		return null;
	}
}