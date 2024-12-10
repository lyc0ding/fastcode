package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @description 用户信息表
*
* @author Tom
* @date 2024-12-10
**/
	@RestController
@RequestMapping(value = "/userInfo")
public class UserInfoController {
@Autowired
	private UserInfoService userInfoService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-10
	**/
	@PostMapping( "")
	public Object insert (UserInfo userInfo){
		userInfoService.insert( userInfo)
	}
}