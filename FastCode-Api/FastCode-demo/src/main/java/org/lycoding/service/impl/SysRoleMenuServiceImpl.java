package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysRoleMenuService;
import org.lycoding.mapper.SysRoleMenuMapper;
import org.lycoding.entity.po.SysRoleMenu;

/**
* @description 角色和菜单关联表
*
* @author Tom
* @date 2024-12-16
**/
public class SysRoleMenuServiceImpl implements SysRoleMenuService{
	@Autowired
	private SysRoleMenuMapper sysRoleMenuMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysRoleMenu sysRoleMenu){
		sysRoleMenuMapper.insert( sysRoleMenu);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysRoleMenuMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysRoleMenuMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysRoleMenuMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysRoleMenuMapper.getById( id );
		return null;
	}
}