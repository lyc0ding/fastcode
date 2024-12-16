package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysLogininforService;
import org.lycoding.mapper.SysLogininforMapper;
import org.lycoding.entity.po.SysLogininfor;

/**
* @description 系统访问记录
*
* @author Tom
* @date 2024-12-16
**/
public class SysLogininforServiceImpl implements SysLogininforService{
	@Autowired
	private SysLogininforMapper sysLogininforMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysLogininfor sysLogininfor){
		sysLogininforMapper.insert( sysLogininfor);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysLogininforMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysLogininforMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysLogininforMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysLogininforMapper.getById( id );
		return null;
	}
}