package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtQuestionnaireDataService;
import org.lycoding.entity.po.HbtQuestionnaireData;

/**
* @description 问卷调查收集数据结果
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtQuestionnaireData")
public class HbtQuestionnaireDataController{
	@Autowired
	private HbtQuestionnaireDataService hbtQuestionnaireDataService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtQuestionnaireData hbtQuestionnaireData){
		hbtQuestionnaireDataService.insert( hbtQuestionnaireData);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtQuestionnaireDataService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtQuestionnaireDataService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtQuestionnaireDataService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtQuestionnaireDataService.getById( id );
		return null;
	}

}