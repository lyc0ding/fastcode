package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtSampleTaskService;
import org.lycoding.entity.po.HbtSampleTask;

/**
* @description 采样任务信息表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtSampleTask")
public class HbtSampleTaskController{
	@Autowired
	private HbtSampleTaskService hbtSampleTaskService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtSampleTask hbtSampleTask){
		hbtSampleTaskService.insert( hbtSampleTask);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtSampleTaskService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtSampleTaskService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtSampleTaskService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtSampleTaskService.getById( id );
		return null;
	}

}