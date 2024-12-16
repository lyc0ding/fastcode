package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzTriggersService;
import org.lycoding.mapper.QrtzTriggersMapper;
import org.lycoding.entity.po.QrtzTriggers;

/**
* @description 触发器详细信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzTriggersServiceImpl implements QrtzTriggersService{
	@Autowired
	private QrtzTriggersMapper qrtzTriggersMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzTriggers qrtzTriggers){
		qrtzTriggersMapper.insert( qrtzTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzTriggersMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzTriggersMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzTriggersMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzTriggersMapper.getById( id );
		return null;
	}
}