package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleCollectionMiddleService;
import org.lycoding.mapper.HbtSampleCollectionMiddleMapper;
import org.lycoding.entity.po.HbtSampleCollectionMiddle;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleCollectionMiddleServiceImpl implements HbtSampleCollectionMiddleService{
	@Autowired
	private HbtSampleCollectionMiddleMapper hbtSampleCollectionMiddleMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleCollectionMiddle hbtSampleCollectionMiddle){
		hbtSampleCollectionMiddleMapper.insert( hbtSampleCollectionMiddle);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleCollectionMiddleMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleCollectionMiddleMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleCollectionMiddleMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleCollectionMiddleMapper.getById( id );
		return null;
	}
}