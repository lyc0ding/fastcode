package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @description 联系人信息表
*
* @author Tom
* @date 2024-12-10
**/
	@RestController
@RequestMapping(value = "/userContacts")
public class UserContactsController {
@Autowired
	private UserContactsService userContactsService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-10
	**/
	@PostMapping( "")
	public Object insert (UserContacts userContacts){
		userContactsService.insert( userContacts)
	}
}