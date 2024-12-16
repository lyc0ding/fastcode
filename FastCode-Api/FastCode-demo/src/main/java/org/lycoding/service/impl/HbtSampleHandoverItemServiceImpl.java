package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.HbtSampleHandoverItemService;
import org.lycoding.mapper.HbtSampleHandoverItemMapper;
import org.lycoding.entity.po.HbtSampleHandoverItem;

/**
* @description 样品交接记录子表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtSampleHandoverItemServiceImpl implements HbtSampleHandoverItemService{
	@Autowired
	private HbtSampleHandoverItemMapper hbtSampleHandoverItemMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (HbtSampleHandoverItem hbtSampleHandoverItem){
		hbtSampleHandoverItemMapper.insert( hbtSampleHandoverItem);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		hbtSampleHandoverItemMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		hbtSampleHandoverItemMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		hbtSampleHandoverItemMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		hbtSampleHandoverItemMapper.getById( id );
		return null;
	}
}