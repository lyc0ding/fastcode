package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.SysRoleMenuService;
import org.lycoding.entity.po.SysRoleMenu;

/**
* @description 角色和菜单关联表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/sysRoleMenu")
public class SysRoleMenuController{
	@Autowired
	private SysRoleMenuService sysRoleMenuService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (SysRoleMenu sysRoleMenu){
		sysRoleMenuService.insert( sysRoleMenu);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		sysRoleMenuService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		sysRoleMenuService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		sysRoleMenuService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		sysRoleMenuService.getById( id );
		return null;
	}

}