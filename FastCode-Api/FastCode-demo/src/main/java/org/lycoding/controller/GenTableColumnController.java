package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.GenTableColumnService;
import org.lycoding.entity.po.GenTableColumn;

/**
* @description 代码生成业务表字段
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/genTableColumn")
public class GenTableColumnController{
	@Autowired
	private GenTableColumnService genTableColumnService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (GenTableColumn genTableColumn){
		genTableColumnService.insert( genTableColumn);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		genTableColumnService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		genTableColumnService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		genTableColumnService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		genTableColumnService.getById( id );
		return null;
	}

}