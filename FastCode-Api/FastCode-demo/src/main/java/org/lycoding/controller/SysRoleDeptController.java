package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.SysRoleDeptService;
import org.lycoding.entity.po.SysRoleDept;

/**
* @description 角色和部门关联表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/sysRoleDept")
public class SysRoleDeptController{
	@Autowired
	private SysRoleDeptService sysRoleDeptService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (SysRoleDept sysRoleDept){
		sysRoleDeptService.insert( sysRoleDept);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		sysRoleDeptService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		sysRoleDeptService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		sysRoleDeptService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		sysRoleDeptService.getById( id );
		return null;
	}

}