package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @description 用户加好友、加入群组申请表
*
* @author Tom
* @date 2024-12-10
**/
	@RestController
@RequestMapping(value = "/userApply")
public class UserApplyController {
@Autowired
	private UserApplyService userApplyService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-10
	**/
	@PostMapping( "")
	public Object insert (UserApply userApply){
		userApplyService.insert( userApply)
	}
}