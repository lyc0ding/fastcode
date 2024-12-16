package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtQuestionnaireProductService;
import org.lycoding.mapper.HbtQuestionnaireProductMapper;
import org.lycoding.entity.po.HbtQuestionnaireProduct;

/**
* @description 调查问卷农业投入品信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQuestionnaireProductServiceImpl implements HbtQuestionnaireProductService{
	@Autowired
	private HbtQuestionnaireProductMapper hbtQuestionnaireProductMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtQuestionnaireProduct hbtQuestionnaireProduct){
		hbtQuestionnaireProductMapper.insert( hbtQuestionnaireProduct);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtQuestionnaireProductMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtQuestionnaireProductMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtQuestionnaireProductMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtQuestionnaireProductMapper.getById( id );
		return null;
	}
}