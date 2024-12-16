package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtQuestionnaireFertilizerService;
import org.lycoding.mapper.HbtQuestionnaireFertilizerMapper;
import org.lycoding.entity.po.HbtQuestionnaireFertilizer;

/**
* @description 村委肥料调查表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQuestionnaireFertilizerServiceImpl implements HbtQuestionnaireFertilizerService{
	@Autowired
	private HbtQuestionnaireFertilizerMapper hbtQuestionnaireFertilizerMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtQuestionnaireFertilizer hbtQuestionnaireFertilizer){
		hbtQuestionnaireFertilizerMapper.insert( hbtQuestionnaireFertilizer);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtQuestionnaireFertilizerMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtQuestionnaireFertilizerMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtQuestionnaireFertilizerMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtQuestionnaireFertilizerMapper.getById( id );
		return null;
	}
}