package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtQuestionnaireDataService;
import org.lycoding.mapper.HbtQuestionnaireDataMapper;
import org.lycoding.entity.po.HbtQuestionnaireData;

/**
* @description 问卷调查收集数据结果
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQuestionnaireDataServiceImpl implements HbtQuestionnaireDataService{
	@Autowired
	private HbtQuestionnaireDataMapper hbtQuestionnaireDataMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtQuestionnaireData hbtQuestionnaireData){
		hbtQuestionnaireDataMapper.insert( hbtQuestionnaireData);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtQuestionnaireDataMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtQuestionnaireDataMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtQuestionnaireDataMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtQuestionnaireDataMapper.getById( id );
		return null;
	}
}