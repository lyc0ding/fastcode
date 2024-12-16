package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysDeptService;
import org.lycoding.mapper.SysDeptMapper;
import org.lycoding.entity.po.SysDept;

/**
* @description 部门表
*
* @author Tom
* @date 2024-12-16
**/
public class SysDeptServiceImpl implements SysDeptService{
	@Autowired
	private SysDeptMapper sysDeptMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysDept sysDept){
		sysDeptMapper.insert( sysDept);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysDeptMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysDeptMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysDeptMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysDeptMapper.getById( id );
		return null;
	}
}