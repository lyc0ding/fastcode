package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysDictDataService;
import org.lycoding.mapper.SysDictDataMapper;
import org.lycoding.entity.po.SysDictData;

/**
* @description 字典数据表
*
* @author Tom
* @date 2024-12-16
**/
public class SysDictDataServiceImpl implements SysDictDataService{
	@Autowired
	private SysDictDataMapper sysDictDataMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysDictData sysDictData){
		sysDictDataMapper.insert( sysDictData);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysDictDataMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysDictDataMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysDictDataMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysDictDataMapper.getById( id );
		return null;
	}
}