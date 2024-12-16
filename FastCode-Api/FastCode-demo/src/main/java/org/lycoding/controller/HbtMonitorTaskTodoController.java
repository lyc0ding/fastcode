package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtMonitorTaskTodoService;
import org.lycoding.entity.po.HbtMonitorTaskTodo;

/**
* @description 监测任务待办
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtMonitorTaskTodo")
public class HbtMonitorTaskTodoController{
	@Autowired
	private HbtMonitorTaskTodoService hbtMonitorTaskTodoService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtMonitorTaskTodo hbtMonitorTaskTodo){
		hbtMonitorTaskTodoService.insert( hbtMonitorTaskTodo);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtMonitorTaskTodoService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtMonitorTaskTodoService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtMonitorTaskTodoService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtMonitorTaskTodoService.getById( id );
		return null;
	}

}