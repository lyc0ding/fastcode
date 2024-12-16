package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleResultService;
import org.lycoding.mapper.HbtSampleResultMapper;
import org.lycoding.entity.po.HbtSampleResult;

/**
* @description 样品采集信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleResultServiceImpl implements HbtSampleResultService{
	@Autowired
	private HbtSampleResultMapper hbtSampleResultMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleResult hbtSampleResult){
		hbtSampleResultMapper.insert( hbtSampleResult);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleResultMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleResultMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleResultMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleResultMapper.getById( id );
		return null;
	}
}