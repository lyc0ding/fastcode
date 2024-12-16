package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.VSamplereceptionlistService;
import org.lycoding.mapper.VSamplereceptionlistMapper;
import org.lycoding.entity.po.VSamplereceptionlist;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
public class VSamplereceptionlistServiceImpl implements VSamplereceptionlistService{
	@Autowired
	private VSamplereceptionlistMapper vSamplereceptionlistMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (VSamplereceptionlist vSamplereceptionlist){
		vSamplereceptionlistMapper.insert( vSamplereceptionlist);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		vSamplereceptionlistMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		vSamplereceptionlistMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		vSamplereceptionlistMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		vSamplereceptionlistMapper.getById( id );
		return null;
	}
}