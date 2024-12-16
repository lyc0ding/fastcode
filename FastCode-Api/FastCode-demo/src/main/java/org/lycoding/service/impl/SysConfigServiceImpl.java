package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysConfigService;
import org.lycoding.mapper.SysConfigMapper;
import org.lycoding.entity.po.SysConfig;

/**
* @description 参数配置表
*
* @author Tom
* @date 2024-12-16
**/
public class SysConfigServiceImpl implements SysConfigService{
	@Autowired
	private SysConfigMapper sysConfigMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysConfig sysConfig){
		sysConfigMapper.insert( sysConfig);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysConfigMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysConfigMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysConfigMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysConfigMapper.getById( id );
		return null;
	}
}