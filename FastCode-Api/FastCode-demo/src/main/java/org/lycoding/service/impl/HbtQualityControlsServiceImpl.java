package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtQualityControlsService;
import org.lycoding.mapper.HbtQualityControlsMapper;
import org.lycoding.entity.po.HbtQualityControls;

/**
* @description 证书信息主表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQualityControlsServiceImpl implements HbtQualityControlsService{
	@Autowired
	private HbtQualityControlsMapper hbtQualityControlsMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtQualityControls hbtQualityControls){
		hbtQualityControlsMapper.insert( hbtQualityControls);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtQualityControlsMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtQualityControlsMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtQualityControlsMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtQualityControlsMapper.getById( id );
		return null;
	}
}