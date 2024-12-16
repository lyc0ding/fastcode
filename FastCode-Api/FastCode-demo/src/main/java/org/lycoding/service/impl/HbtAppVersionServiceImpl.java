package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtAppVersionService;
import org.lycoding.mapper.HbtAppVersionMapper;
import org.lycoding.entity.po.HbtAppVersion;

/**
* @description app版本;https://ext.dcloud.net.cn/plugin?id=7286
*
* @author Tom
* @date 2024-12-16
**/
public class HbtAppVersionServiceImpl implements HbtAppVersionService{
	@Autowired
	private HbtAppVersionMapper hbtAppVersionMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtAppVersion hbtAppVersion){
		hbtAppVersionMapper.insert( hbtAppVersion);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtAppVersionMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtAppVersionMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtAppVersionMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtAppVersionMapper.getById( id );
		return null;
	}
}