package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzSchedulerStateService;
import org.lycoding.mapper.QrtzSchedulerStateMapper;
import org.lycoding.entity.po.QrtzSchedulerState;

/**
* @description 调度器状态表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzSchedulerStateServiceImpl implements QrtzSchedulerStateService{
	@Autowired
	private QrtzSchedulerStateMapper qrtzSchedulerStateMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzSchedulerState qrtzSchedulerState){
		qrtzSchedulerStateMapper.insert( qrtzSchedulerState);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzSchedulerStateMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzSchedulerStateMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzSchedulerStateMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzSchedulerStateMapper.getById( id );
		return null;
	}
}