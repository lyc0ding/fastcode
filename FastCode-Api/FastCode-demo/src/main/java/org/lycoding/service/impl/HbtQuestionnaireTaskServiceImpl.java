package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtQuestionnaireTaskService;
import org.lycoding.mapper.HbtQuestionnaireTaskMapper;
import org.lycoding.entity.po.HbtQuestionnaireTask;

/**
* @description 问卷调查任务
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQuestionnaireTaskServiceImpl implements HbtQuestionnaireTaskService{
	@Autowired
	private HbtQuestionnaireTaskMapper hbtQuestionnaireTaskMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtQuestionnaireTask hbtQuestionnaireTask){
		hbtQuestionnaireTaskMapper.insert( hbtQuestionnaireTask);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtQuestionnaireTaskMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtQuestionnaireTaskMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtQuestionnaireTaskMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtQuestionnaireTaskMapper.getById( id );
		return null;
	}
}