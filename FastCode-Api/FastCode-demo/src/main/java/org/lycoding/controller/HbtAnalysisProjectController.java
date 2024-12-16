package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtAnalysisProjectService;
import org.lycoding.entity.po.HbtAnalysisProject;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtAnalysisProject")
public class HbtAnalysisProjectController{
	@Autowired
	private HbtAnalysisProjectService hbtAnalysisProjectService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtAnalysisProject hbtAnalysisProject){
		hbtAnalysisProjectService.insert( hbtAnalysisProject);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtAnalysisProjectService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtAnalysisProjectService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtAnalysisProjectService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtAnalysisProjectService.getById( id );
		return null;
	}

}