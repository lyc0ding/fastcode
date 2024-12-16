package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtSampleHandoverItemService;
import org.lycoding.entity.po.HbtSampleHandoverItem;

/**
* @description 样品交接记录子表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtSampleHandoverItem")
public class HbtSampleHandoverItemController{
	@Autowired
	private HbtSampleHandoverItemService hbtSampleHandoverItemService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtSampleHandoverItem hbtSampleHandoverItem){
		hbtSampleHandoverItemService.insert( hbtSampleHandoverItem);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtSampleHandoverItemService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtSampleHandoverItemService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtSampleHandoverItemService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtSampleHandoverItemService.getById( id );
		return null;
	}

}