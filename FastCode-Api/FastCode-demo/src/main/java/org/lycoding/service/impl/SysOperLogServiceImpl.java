package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysOperLogService;
import org.lycoding.mapper.SysOperLogMapper;
import org.lycoding.entity.po.SysOperLog;

/**
* @description 操作日志记录
*
* @author Tom
* @date 2024-12-16
**/
public class SysOperLogServiceImpl implements SysOperLogService{
	@Autowired
	private SysOperLogMapper sysOperLogMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysOperLog sysOperLog){
		sysOperLogMapper.insert( sysOperLog);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysOperLogMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysOperLogMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysOperLogMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysOperLogMapper.getById( id );
		return null;
	}
}