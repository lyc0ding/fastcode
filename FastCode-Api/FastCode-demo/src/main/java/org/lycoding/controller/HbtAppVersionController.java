package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtAppVersionService;
import org.lycoding.entity.po.HbtAppVersion;

/**
* @description app版本;https://ext.dcloud.net.cn/plugin?id=7286
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtAppVersion")
public class HbtAppVersionController{
	@Autowired
	private HbtAppVersionService hbtAppVersionService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtAppVersion hbtAppVersion){
		hbtAppVersionService.insert( hbtAppVersion);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtAppVersionService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtAppVersionService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtAppVersionService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtAppVersionService.getById( id );
		return null;
	}

}