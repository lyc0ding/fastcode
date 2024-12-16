package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtQuestionnaireTaskService;
import org.lycoding.entity.po.HbtQuestionnaireTask;

/**
* @description 问卷调查任务
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtQuestionnaireTask")
public class HbtQuestionnaireTaskController{
	@Autowired
	private HbtQuestionnaireTaskService hbtQuestionnaireTaskService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtQuestionnaireTask hbtQuestionnaireTask){
		hbtQuestionnaireTaskService.insert( hbtQuestionnaireTask);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtQuestionnaireTaskService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtQuestionnaireTaskService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtQuestionnaireTaskService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtQuestionnaireTaskService.getById( id );
		return null;
	}

}