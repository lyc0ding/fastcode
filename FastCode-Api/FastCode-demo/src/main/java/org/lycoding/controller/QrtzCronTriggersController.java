package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.QrtzCronTriggersService;
import org.lycoding.entity.po.QrtzCronTriggers;

/**
* @description Cron类型的触发器表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/qrtzCronTriggers")
public class QrtzCronTriggersController{
	@Autowired
	private QrtzCronTriggersService qrtzCronTriggersService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (QrtzCronTriggers qrtzCronTriggers){
		qrtzCronTriggersService.insert( qrtzCronTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		qrtzCronTriggersService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		qrtzCronTriggersService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		qrtzCronTriggersService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		qrtzCronTriggersService.getById( id );
		return null;
	}

}