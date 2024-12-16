package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysRoleDeptService;
import org.lycoding.mapper.SysRoleDeptMapper;
import org.lycoding.entity.po.SysRoleDept;

/**
* @description 角色和部门关联表
*
* @author Tom
* @date 2024-12-16
**/
public class SysRoleDeptServiceImpl implements SysRoleDeptService{
	@Autowired
	private SysRoleDeptMapper sysRoleDeptMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysRoleDept sysRoleDept){
		sysRoleDeptMapper.insert( sysRoleDept);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysRoleDeptMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysRoleDeptMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysRoleDeptMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysRoleDeptMapper.getById( id );
		return null;
	}
}