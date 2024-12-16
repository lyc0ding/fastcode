package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzFiredTriggersService;
import org.lycoding.mapper.QrtzFiredTriggersMapper;
import org.lycoding.entity.po.QrtzFiredTriggers;

/**
* @description 已触发的触发器表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzFiredTriggersServiceImpl implements QrtzFiredTriggersService{
	@Autowired
	private QrtzFiredTriggersMapper qrtzFiredTriggersMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzFiredTriggers qrtzFiredTriggers){
		qrtzFiredTriggersMapper.insert( qrtzFiredTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzFiredTriggersMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzFiredTriggersMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzFiredTriggersMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzFiredTriggersMapper.getById( id );
		return null;
	}
}