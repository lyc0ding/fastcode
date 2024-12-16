package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysRoleService;
import org.lycoding.mapper.SysRoleMapper;
import org.lycoding.entity.po.SysRole;

/**
* @description 角色信息表
*
* @author Tom
* @date 2024-12-16
**/
public class SysRoleServiceImpl implements SysRoleService{
	@Autowired
	private SysRoleMapper sysRoleMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysRole sysRole){
		sysRoleMapper.insert( sysRole);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysRoleMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysRoleMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysRoleMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysRoleMapper.getById( id );
		return null;
	}
}