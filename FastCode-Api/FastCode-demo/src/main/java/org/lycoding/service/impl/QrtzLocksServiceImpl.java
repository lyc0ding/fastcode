package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzLocksService;
import org.lycoding.mapper.QrtzLocksMapper;
import org.lycoding.entity.po.QrtzLocks;

/**
* @description 存储的悲观锁信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzLocksServiceImpl implements QrtzLocksService{
	@Autowired
	private QrtzLocksMapper qrtzLocksMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzLocks qrtzLocks){
		qrtzLocksMapper.insert( qrtzLocks);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzLocksMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzLocksMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzLocksMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzLocksMapper.getById( id );
		return null;
	}
}