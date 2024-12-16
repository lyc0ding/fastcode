package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtQualityItemService;
import org.lycoding.mapper.HbtQualityItemMapper;
import org.lycoding.entity.po.HbtQualityItem;

/**
* @description 证书编号信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQualityItemServiceImpl implements HbtQualityItemService{
	@Autowired
	private HbtQualityItemMapper hbtQualityItemMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtQualityItem hbtQualityItem){
		hbtQualityItemMapper.insert( hbtQualityItem);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtQualityItemMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtQualityItemMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtQualityItemMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtQualityItemMapper.getById( id );
		return null;
	}
}