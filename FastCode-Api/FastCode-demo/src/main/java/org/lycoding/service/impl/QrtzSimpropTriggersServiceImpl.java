package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzSimpropTriggersService;
import org.lycoding.mapper.QrtzSimpropTriggersMapper;
import org.lycoding.entity.po.QrtzSimpropTriggers;

/**
* @description 同步机制的行锁表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzSimpropTriggersServiceImpl implements QrtzSimpropTriggersService{
	@Autowired
	private QrtzSimpropTriggersMapper qrtzSimpropTriggersMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzSimpropTriggers qrtzSimpropTriggers){
		qrtzSimpropTriggersMapper.insert( qrtzSimpropTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzSimpropTriggersMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzSimpropTriggersMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzSimpropTriggersMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzSimpropTriggersMapper.getById( id );
		return null;
	}
}