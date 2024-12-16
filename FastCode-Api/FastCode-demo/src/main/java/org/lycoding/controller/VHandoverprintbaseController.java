package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.VHandoverprintbaseService;
import org.lycoding.entity.po.VHandoverprintbase;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/vHandoverprintbase")
public class VHandoverprintbaseController{
	@Autowired
	private VHandoverprintbaseService vHandoverprintbaseService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (VHandoverprintbase vHandoverprintbase){
		vHandoverprintbaseService.insert( vHandoverprintbase);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		vHandoverprintbaseService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		vHandoverprintbaseService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		vHandoverprintbaseService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		vHandoverprintbaseService.getById( id );
		return null;
	}

}