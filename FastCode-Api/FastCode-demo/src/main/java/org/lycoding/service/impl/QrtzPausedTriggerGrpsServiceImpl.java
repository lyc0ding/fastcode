package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzPausedTriggerGrpsService;
import org.lycoding.mapper.QrtzPausedTriggerGrpsMapper;
import org.lycoding.entity.po.QrtzPausedTriggerGrps;

/**
* @description 暂停的触发器表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzPausedTriggerGrpsServiceImpl implements QrtzPausedTriggerGrpsService{
	@Autowired
	private QrtzPausedTriggerGrpsMapper qrtzPausedTriggerGrpsMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzPausedTriggerGrps qrtzPausedTriggerGrps){
		qrtzPausedTriggerGrpsMapper.insert( qrtzPausedTriggerGrps);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzPausedTriggerGrpsMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzPausedTriggerGrpsMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzPausedTriggerGrpsMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzPausedTriggerGrpsMapper.getById( id );
		return null;
	}
}