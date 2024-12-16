package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtQualityStandardService;
import org.lycoding.mapper.HbtQualityStandardMapper;
import org.lycoding.entity.po.HbtQualityStandard;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQualityStandardServiceImpl implements HbtQualityStandardService{
	@Autowired
	private HbtQualityStandardMapper hbtQualityStandardMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtQualityStandard hbtQualityStandard){
		hbtQualityStandardMapper.insert( hbtQualityStandard);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtQualityStandardMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtQualityStandardMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtQualityStandardMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtQualityStandardMapper.getById( id );
		return null;
	}
}