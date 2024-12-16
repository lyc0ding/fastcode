package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.GenTableService;
import org.lycoding.entity.po.GenTable;

/**
* @description 代码生成业务表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/genTable")
public class GenTableController{
	@Autowired
	private GenTableService genTableService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (GenTable genTable){
		genTableService.insert( genTable);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		genTableService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		genTableService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		genTableService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		genTableService.getById( id );
		return null;
	}

}