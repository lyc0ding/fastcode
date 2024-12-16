package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.QrtzJobDetailsService;
import org.lycoding.entity.po.QrtzJobDetails;

/**
* @description 任务详细信息表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/qrtzJobDetails")
public class QrtzJobDetailsController{
	@Autowired
	private QrtzJobDetailsService qrtzJobDetailsService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (QrtzJobDetails qrtzJobDetails){
		qrtzJobDetailsService.insert( qrtzJobDetails);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		qrtzJobDetailsService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		qrtzJobDetailsService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		qrtzJobDetailsService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		qrtzJobDetailsService.getById( id );
		return null;
	}

}