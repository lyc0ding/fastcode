package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysUserPostService;
import org.lycoding.mapper.SysUserPostMapper;
import org.lycoding.entity.po.SysUserPost;

/**
* @description 用户与岗位关联表
*
* @author Tom
* @date 2024-12-16
**/
public class SysUserPostServiceImpl implements SysUserPostService{
	@Autowired
	private SysUserPostMapper sysUserPostMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysUserPost sysUserPost){
		sysUserPostMapper.insert( sysUserPost);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysUserPostMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysUserPostMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysUserPostMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysUserPostMapper.getById( id );
		return null;
	}
}