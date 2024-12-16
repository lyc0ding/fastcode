package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtPointInfoService;
import org.lycoding.mapper.HbtPointInfoMapper;
import org.lycoding.entity.po.HbtPointInfo;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtPointInfoServiceImpl implements HbtPointInfoService{
	@Autowired
	private HbtPointInfoMapper hbtPointInfoMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtPointInfo hbtPointInfo){
		hbtPointInfoMapper.insert( hbtPointInfo);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtPointInfoMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtPointInfoMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtPointInfoMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtPointInfoMapper.getById( id );
		return null;
	}
}