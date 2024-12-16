package org.lycoding.mapper;
import org.lycoding.entity.po.HbtQuestionnaireProduct;

/**
* @description 调查问卷农业投入品信息表
*
* @author Tom
* @date 2024-12-16
**/
public interface HbtQuestionnaireProductMapper {

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	public Object insert (HbtQuestionnaireProduct hbtQuestionnaireProduct);

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	public Object deleteById ( Long id );

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	public Object getById ( Long id );

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	public Object getList ();

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	public Object updateById ( Long id );

}