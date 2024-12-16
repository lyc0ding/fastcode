package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.lycoding.service.HbtSampleSurveyEnterpriseService;
import org.lycoding.entity.po.HbtSampleSurveyEnterprise;

/**
* @description 采样任务企业调查
*
* @author Tom
* @date 2024-12-16
**/
@RestController
@RequestMapping(value = "/hbtSampleSurveyEnterprise")
public class HbtSampleSurveyEnterpriseController{
	@Autowired
	private HbtSampleSurveyEnterpriseService hbtSampleSurveyEnterpriseService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@PostMapping( "/" )
	public Object insert (HbtSampleSurveyEnterprise hbtSampleSurveyEnterprise){
		hbtSampleSurveyEnterpriseService.insert( hbtSampleSurveyEnterprise);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@DeleteMapping( "/{id}" )
	public Object deleteById ( @PathVariable Long id ){
		hbtSampleSurveyEnterpriseService.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/{id}" )
	public Object getById ( @PathVariable Long id ){
		hbtSampleSurveyEnterpriseService.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@GetMapping( "/list" )
	public Object getList (){
		hbtSampleSurveyEnterpriseService.getList();
		return null;
	}
	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@PutMapping( "/{id}" )
	public Object updateById ( @PathVariable Long id ){
		hbtSampleSurveyEnterpriseService.getById( id );
		return null;
	}

}