package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.QrtzSimpleTriggersService;
import org.lycoding.entity.po.QrtzSimpleTriggers;

/**
* @description 简单触发器的信息表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/qrtzSimpleTriggers")
public class QrtzSimpleTriggersController{
	@Autowired
	private QrtzSimpleTriggersService qrtzSimpleTriggersService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (QrtzSimpleTriggers qrtzSimpleTriggers){
		qrtzSimpleTriggersService.insert( qrtzSimpleTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		qrtzSimpleTriggersService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		qrtzSimpleTriggersService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		qrtzSimpleTriggersService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		qrtzSimpleTriggersService.getById( id );
		return null;
	}

}