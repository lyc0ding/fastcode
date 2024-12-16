package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzCalendarsService;
import org.lycoding.mapper.QrtzCalendarsMapper;
import org.lycoding.entity.po.QrtzCalendars;

/**
* @description 日历信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzCalendarsServiceImpl implements QrtzCalendarsService{
	@Autowired
	private QrtzCalendarsMapper qrtzCalendarsMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzCalendars qrtzCalendars){
		qrtzCalendarsMapper.insert( qrtzCalendars);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzCalendarsMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzCalendarsMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzCalendarsMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzCalendarsMapper.getById( id );
		return null;
	}
}