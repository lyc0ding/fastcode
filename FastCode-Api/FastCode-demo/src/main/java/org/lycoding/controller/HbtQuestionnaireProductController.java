package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtQuestionnaireProductService;
import org.lycoding.entity.po.HbtQuestionnaireProduct;

/**
* @description 调查问卷农业投入品信息表
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtQuestionnaireProduct")
public class HbtQuestionnaireProductController{
	@Autowired
	private HbtQuestionnaireProductService hbtQuestionnaireProductService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtQuestionnaireProduct hbtQuestionnaireProduct){
		hbtQuestionnaireProductService.insert( hbtQuestionnaireProduct);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtQuestionnaireProductService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtQuestionnaireProductService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtQuestionnaireProductService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtQuestionnaireProductService.getById( id );
		return null;
	}

}