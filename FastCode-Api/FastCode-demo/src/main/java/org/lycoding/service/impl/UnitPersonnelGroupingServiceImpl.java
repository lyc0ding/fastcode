package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.UnitPersonnelGroupingService;
import org.lycoding.mapper.UnitPersonnelGroupingMapper;
import org.lycoding.entity.po.UnitPersonnelGrouping;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class UnitPersonnelGroupingServiceImpl implements UnitPersonnelGroupingService{
	@Autowired
	private UnitPersonnelGroupingMapper unitPersonnelGroupingMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (UnitPersonnelGrouping unitPersonnelGrouping){
		unitPersonnelGroupingMapper.insert( unitPersonnelGrouping);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		unitPersonnelGroupingMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		unitPersonnelGroupingMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		unitPersonnelGroupingMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		unitPersonnelGroupingMapper.getById( id );
		return null;
	}
}