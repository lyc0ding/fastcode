package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtFormTemplateService;
import org.lycoding.mapper.HbtFormTemplateMapper;
import org.lycoding.entity.po.HbtFormTemplate;

/**
* @description 问卷表单模板
*
* @author Tom
* @date 2024-12-16
**/
public class HbtFormTemplateServiceImpl implements HbtFormTemplateService{
	@Autowired
	private HbtFormTemplateMapper hbtFormTemplateMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtFormTemplate hbtFormTemplate){
		hbtFormTemplateMapper.insert( hbtFormTemplate);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtFormTemplateMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtFormTemplateMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtFormTemplateMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtFormTemplateMapper.getById( id );
		return null;
	}
}