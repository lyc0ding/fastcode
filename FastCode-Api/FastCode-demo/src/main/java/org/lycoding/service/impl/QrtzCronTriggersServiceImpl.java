package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzCronTriggersService;
import org.lycoding.mapper.QrtzCronTriggersMapper;
import org.lycoding.entity.po.QrtzCronTriggers;

/**
* @description Cron类型的触发器表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzCronTriggersServiceImpl implements QrtzCronTriggersService{
	@Autowired
	private QrtzCronTriggersMapper qrtzCronTriggersMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzCronTriggers qrtzCronTriggers){
		qrtzCronTriggersMapper.insert( qrtzCronTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzCronTriggersMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzCronTriggersMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzCronTriggersMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzCronTriggersMapper.getById( id );
		return null;
	}
}