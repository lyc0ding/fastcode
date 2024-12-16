package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtAnalysisProjectService;
import org.lycoding.mapper.HbtAnalysisProjectMapper;
import org.lycoding.entity.po.HbtAnalysisProject;

/**
* @description 
*
* @author Tom
* @date 2024-12-16
**/
public class HbtAnalysisProjectServiceImpl implements HbtAnalysisProjectService{
	@Autowired
	private HbtAnalysisProjectMapper hbtAnalysisProjectMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtAnalysisProject hbtAnalysisProject){
		hbtAnalysisProjectMapper.insert( hbtAnalysisProject);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtAnalysisProjectMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtAnalysisProjectMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtAnalysisProjectMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtAnalysisProjectMapper.getById( id );
		return null;
	}
}