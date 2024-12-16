package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.VHandoverprintbaseService;
import org.lycoding.mapper.VHandoverprintbaseMapper;
import org.lycoding.entity.po.VHandoverprintbase;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
public class VHandoverprintbaseServiceImpl implements VHandoverprintbaseService{
	@Autowired
	private VHandoverprintbaseMapper vHandoverprintbaseMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (VHandoverprintbase vHandoverprintbase){
		vHandoverprintbaseMapper.insert( vHandoverprintbase);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		vHandoverprintbaseMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		vHandoverprintbaseMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		vHandoverprintbaseMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		vHandoverprintbaseMapper.getById( id );
		return null;
	}
}