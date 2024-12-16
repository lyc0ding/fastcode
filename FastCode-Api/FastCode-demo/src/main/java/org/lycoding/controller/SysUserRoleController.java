package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.SysUserRoleService;
import org.lycoding.entity.po.SysUserRole;

/**
* @description 用户和角色关联表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/sysUserRole")
public class SysUserRoleController{
	@Autowired
	private SysUserRoleService sysUserRoleService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (SysUserRole sysUserRole){
		sysUserRoleService.insert( sysUserRole);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		sysUserRoleService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		sysUserRoleService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		sysUserRoleService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		sysUserRoleService.getById( id );
		return null;
	}

}