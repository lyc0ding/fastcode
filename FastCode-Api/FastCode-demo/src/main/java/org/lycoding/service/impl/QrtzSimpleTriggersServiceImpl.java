package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzSimpleTriggersService;
import org.lycoding.mapper.QrtzSimpleTriggersMapper;
import org.lycoding.entity.po.QrtzSimpleTriggers;

/**
* @description 简单触发器的信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzSimpleTriggersServiceImpl implements QrtzSimpleTriggersService{
	@Autowired
	private QrtzSimpleTriggersMapper qrtzSimpleTriggersMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzSimpleTriggers qrtzSimpleTriggers){
		qrtzSimpleTriggersMapper.insert( qrtzSimpleTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzSimpleTriggersMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzSimpleTriggersMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzSimpleTriggersMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzSimpleTriggersMapper.getById( id );
		return null;
	}
}