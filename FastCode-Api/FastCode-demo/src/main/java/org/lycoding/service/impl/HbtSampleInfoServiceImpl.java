package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleInfoService;
import org.lycoding.mapper.HbtSampleInfoMapper;
import org.lycoding.entity.po.HbtSampleInfo;

/**
* @description 样品信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleInfoServiceImpl implements HbtSampleInfoService{
	@Autowired
	private HbtSampleInfoMapper hbtSampleInfoMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleInfo hbtSampleInfo){
		hbtSampleInfoMapper.insert( hbtSampleInfo);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleInfoMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleInfoMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleInfoMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleInfoMapper.getById( id );
		return null;
	}
}