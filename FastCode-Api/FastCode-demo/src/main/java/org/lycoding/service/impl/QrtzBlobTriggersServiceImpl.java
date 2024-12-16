package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.QrtzBlobTriggersService;
import org.lycoding.mapper.QrtzBlobTriggersMapper;
import org.lycoding.entity.po.QrtzBlobTriggers;

/**
* @description Blob类型的触发器表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzBlobTriggersServiceImpl implements QrtzBlobTriggersService{
	@Autowired
	private QrtzBlobTriggersMapper qrtzBlobTriggersMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (QrtzBlobTriggers qrtzBlobTriggers){
		qrtzBlobTriggersMapper.insert( qrtzBlobTriggers);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		qrtzBlobTriggersMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		qrtzBlobTriggersMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		qrtzBlobTriggersMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		qrtzBlobTriggersMapper.getById( id );
		return null;
	}
}