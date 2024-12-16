package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysJobLogService;
import org.lycoding.mapper.SysJobLogMapper;
import org.lycoding.entity.po.SysJobLog;

/**
* @description 定时任务调度日志表
*
* @author Tom
* @date 2024-12-16
**/
public class SysJobLogServiceImpl implements SysJobLogService{
	@Autowired
	private SysJobLogMapper sysJobLogMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysJobLog sysJobLog){
		sysJobLogMapper.insert( sysJobLog);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysJobLogMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysJobLogMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysJobLogMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysJobLogMapper.getById( id );
		return null;
	}
}