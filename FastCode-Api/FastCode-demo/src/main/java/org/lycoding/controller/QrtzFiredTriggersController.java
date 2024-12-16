package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.QrtzFiredTriggersService;
import org.lycoding.entity.po.QrtzFiredTriggers;

/**
* @description 已触发的触发器表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/qrtzFiredTriggers")
public class QrtzFiredTriggersController{
	@Autowired
	private QrtzFiredTriggersService qrtzFiredTriggersService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (QrtzFiredTriggers qrtzFiredTriggers){
		qrtzFiredTriggersService.insert( qrtzFiredTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		qrtzFiredTriggersService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		qrtzFiredTriggersService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		qrtzFiredTriggersService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		qrtzFiredTriggersService.getById( id );
		return null;
	}

}