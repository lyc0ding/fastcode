package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzJobDetailsService;
import org.lycoding.mapper.QrtzJobDetailsMapper;
import org.lycoding.entity.po.QrtzJobDetails;

/**
* @description 任务详细信息表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzJobDetailsServiceImpl implements QrtzJobDetailsService{
	@Autowired
	private QrtzJobDetailsMapper qrtzJobDetailsMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzJobDetails qrtzJobDetails){
		qrtzJobDetailsMapper.insert( qrtzJobDetails);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzJobDetailsMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzJobDetailsMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzJobDetailsMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzJobDetailsMapper.getById( id );
		return null;
	}
}