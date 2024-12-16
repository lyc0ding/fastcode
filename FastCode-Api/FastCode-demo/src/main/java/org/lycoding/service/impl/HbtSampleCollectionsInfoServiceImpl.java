package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleCollectionsInfoService;
import org.lycoding.mapper.HbtSampleCollectionsInfoMapper;
import org.lycoding.entity.po.HbtSampleCollectionsInfo;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleCollectionsInfoServiceImpl implements HbtSampleCollectionsInfoService{
	@Autowired
	private HbtSampleCollectionsInfoMapper hbtSampleCollectionsInfoMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleCollectionsInfo hbtSampleCollectionsInfo){
		hbtSampleCollectionsInfoMapper.insert( hbtSampleCollectionsInfo);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleCollectionsInfoMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleCollectionsInfoMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleCollectionsInfoMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleCollectionsInfoMapper.getById( id );
		return null;
	}
}