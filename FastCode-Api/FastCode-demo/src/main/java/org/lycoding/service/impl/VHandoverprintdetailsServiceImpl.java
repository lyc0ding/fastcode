package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.VHandoverprintdetailsService;
import org.lycoding.mapper.VHandoverprintdetailsMapper;
import org.lycoding.entity.po.VHandoverprintdetails;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
public class VHandoverprintdetailsServiceImpl implements VHandoverprintdetailsService{
	@Autowired
	private VHandoverprintdetailsMapper vHandoverprintdetailsMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (VHandoverprintdetails vHandoverprintdetails){
		vHandoverprintdetailsMapper.insert( vHandoverprintdetails);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		vHandoverprintdetailsMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		vHandoverprintdetailsMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		vHandoverprintdetailsMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		vHandoverprintdetailsMapper.getById( id );
		return null;
	}
}