package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.VSamplereceptionlistService;
import org.lycoding.entity.po.VSamplereceptionlist;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/vSamplereceptionlist")
public class VSamplereceptionlistController{
	@Autowired
	private VSamplereceptionlistService vSamplereceptionlistService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (VSamplereceptionlist vSamplereceptionlist){
		vSamplereceptionlistService.insert( vSamplereceptionlist);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		vSamplereceptionlistService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		vSamplereceptionlistService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		vSamplereceptionlistService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		vSamplereceptionlistService.getById( id );
		return null;
	}

}