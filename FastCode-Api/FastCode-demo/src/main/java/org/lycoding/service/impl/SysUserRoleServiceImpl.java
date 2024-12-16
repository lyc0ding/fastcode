package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysUserRoleService;
import org.lycoding.mapper.SysUserRoleMapper;
import org.lycoding.entity.po.SysUserRole;

/**
* @description 用户和角色关联表
*
* @author Tom
* @date 2024-12-16
**/
public class SysUserRoleServiceImpl implements SysUserRoleService{
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysUserRole sysUserRole){
		sysUserRoleMapper.insert( sysUserRole);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysUserRoleMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysUserRoleMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysUserRoleMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysUserRoleMapper.getById( id );
		return null;
	}
}