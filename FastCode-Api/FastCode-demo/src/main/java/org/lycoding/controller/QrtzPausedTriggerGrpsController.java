package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.QrtzPausedTriggerGrpsService;
import org.lycoding.entity.po.QrtzPausedTriggerGrps;

/**
* @description 暂停的触发器表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/qrtzPausedTriggerGrps")
public class QrtzPausedTriggerGrpsController{
	@Autowired
	private QrtzPausedTriggerGrpsService qrtzPausedTriggerGrpsService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (QrtzPausedTriggerGrps qrtzPausedTriggerGrps){
		qrtzPausedTriggerGrpsService.insert( qrtzPausedTriggerGrps);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		qrtzPausedTriggerGrpsService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		qrtzPausedTriggerGrpsService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		qrtzPausedTriggerGrpsService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		qrtzPausedTriggerGrpsService.getById( id );
		return null;
	}

}