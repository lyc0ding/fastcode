package org.lycoding.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.lycoding.service.SysNoticeService;
import org.lycoding.mapper.SysNoticeMapper;
import org.lycoding.entity.po.SysNotice;

/**
* @description 通知公告表
*
* @author Tom
* @date 2024-12-16
**/
public class SysNoticeServiceImpl implements SysNoticeService{
	@Autowired
	private SysNoticeMapper sysNoticeMapper;

	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object insert (SysNotice sysNotice){
		sysNoticeMapper.insert( sysNotice);
		return null;
	}

	/**
	* @description 根据id删除
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object deleteById ( Long id ){
		sysNoticeMapper.deleteById( id );
		return null;
	}

	/**
	* @description 根据id查找
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getById ( Long id ){
		sysNoticeMapper.getById( id );
		return null;
	}

	/**
	* @description 查找列表
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object getList (){
		sysNoticeMapper.getList();
		return null;
	}

	/**
	* @description 根据id修改
	* @author Tom
	* @date 2024-12-16
	**/
	@Override
	public Object updateById (Long id ){
		sysNoticeMapper.getById( id );
		return null;
	}
}