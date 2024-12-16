package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleSurveyEnterpriseService;
import org.lycoding.mapper.HbtSampleSurveyEnterpriseMapper;
import org.lycoding.entity.po.HbtSampleSurveyEnterprise;

/**
* @description 采样任务企业调查
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleSurveyEnterpriseServiceImpl implements HbtSampleSurveyEnterpriseService{
	@Autowired
	private HbtSampleSurveyEnterpriseMapper hbtSampleSurveyEnterpriseMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleSurveyEnterprise hbtSampleSurveyEnterprise){
		hbtSampleSurveyEnterpriseMapper.insert( hbtSampleSurveyEnterprise);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleSurveyEnterpriseMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleSurveyEnterpriseMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleSurveyEnterpriseMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleSurveyEnterpriseMapper.getById( id );
		return null;
	}
}