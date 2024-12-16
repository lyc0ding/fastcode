package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.QrtzLocksService;
import org.lycoding.entity.po.QrtzLocks;

/**
* @description 存储的悲观锁信息表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/qrtzLocks")
public class QrtzLocksController{
	@Autowired
	private QrtzLocksService qrtzLocksService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (QrtzLocks qrtzLocks){
		qrtzLocksService.insert( qrtzLocks);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		qrtzLocksService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		qrtzLocksService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		qrtzLocksService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		qrtzLocksService.getById( id );
		return null;
	}

}