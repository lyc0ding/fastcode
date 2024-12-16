package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.VSamplereceptionlistbaseService;
import org.lycoding.mapper.VSamplereceptionlistbaseMapper;
import org.lycoding.entity.po.VSamplereceptionlistbase;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
public class VSamplereceptionlistbaseServiceImpl implements VSamplereceptionlistbaseService{
	@Autowired
	private VSamplereceptionlistbaseMapper vSamplereceptionlistbaseMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (VSamplereceptionlistbase vSamplereceptionlistbase){
		vSamplereceptionlistbaseMapper.insert( vSamplereceptionlistbase);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		vSamplereceptionlistbaseMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		vSamplereceptionlistbaseMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		vSamplereceptionlistbaseMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		vSamplereceptionlistbaseMapper.getById( id );
		return null;
	}
}