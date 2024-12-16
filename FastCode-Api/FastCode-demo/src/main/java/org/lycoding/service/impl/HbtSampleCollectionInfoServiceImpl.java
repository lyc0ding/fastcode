package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleCollectionInfoService;
import org.lycoding.mapper.HbtSampleCollectionInfoMapper;
import org.lycoding.entity.po.HbtSampleCollectionInfo;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleCollectionInfoServiceImpl implements HbtSampleCollectionInfoService{
	@Autowired
	private HbtSampleCollectionInfoMapper hbtSampleCollectionInfoMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleCollectionInfo hbtSampleCollectionInfo){
		hbtSampleCollectionInfoMapper.insert( hbtSampleCollectionInfo);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleCollectionInfoMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleCollectionInfoMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleCollectionInfoMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleCollectionInfoMapper.getById( id );
		return null;
	}
}