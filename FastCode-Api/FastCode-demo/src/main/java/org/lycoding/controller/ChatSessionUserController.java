package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @description 会话用户表
*
* @author Tom
* @date 2024-12-10
**/
	@RestController
@RequestMapping(value = "/chatSessionUser")
public class ChatSessionUserController {
@Autowired
	private ChatSessionUserService chatSessionUserService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-10
	**/
	@PostMapping( "")
	public Object insert (ChatSessionUser chatSessionUser){
		chatSessionUserService.insert( chatSessionUser)
	}
}