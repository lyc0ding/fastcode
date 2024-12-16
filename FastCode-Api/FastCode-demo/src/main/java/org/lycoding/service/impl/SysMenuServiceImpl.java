package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysMenuService;
import org.lycoding.mapper.SysMenuMapper;
import org.lycoding.entity.po.SysMenu;

/**
* @description 菜单权限表
*
* @author Tom
* @date 2024-12-16
**/
public class SysMenuServiceImpl implements SysMenuService{
	@Autowired
	private SysMenuMapper sysMenuMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysMenu sysMenu){
		sysMenuMapper.insert( sysMenu);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysMenuMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysMenuMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysMenuMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysMenuMapper.getById( id );
		return null;
	}
}