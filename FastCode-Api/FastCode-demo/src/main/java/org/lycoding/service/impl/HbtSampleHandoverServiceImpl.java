package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleHandoverService;
import org.lycoding.mapper.HbtSampleHandoverMapper;
import org.lycoding.entity.po.HbtSampleHandover;

/**
* @description 样品交接记录表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleHandoverServiceImpl implements HbtSampleHandoverService{
	@Autowired
	private HbtSampleHandoverMapper hbtSampleHandoverMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleHandover hbtSampleHandover){
		hbtSampleHandoverMapper.insert( hbtSampleHandover);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleHandoverMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleHandoverMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleHandoverMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleHandoverMapper.getById( id );
		return null;
	}
}