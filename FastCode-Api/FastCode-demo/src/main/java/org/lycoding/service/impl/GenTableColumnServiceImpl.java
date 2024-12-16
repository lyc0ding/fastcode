package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.GenTableColumnService;
import org.lycoding.mapper.GenTableColumnMapper;
import org.lycoding.entity.po.GenTableColumn;

/**
* @description 代码生成业务表字段
*
* @author Tom
* @date 2024-12-16
**/
public class GenTableColumnServiceImpl implements GenTableColumnService{
	@Autowired
	private GenTableColumnMapper genTableColumnMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (GenTableColumn genTableColumn){
		genTableColumnMapper.insert( genTableColumn);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		genTableColumnMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		genTableColumnMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		genTableColumnMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		genTableColumnMapper.getById( id );
		return null;
	}
}