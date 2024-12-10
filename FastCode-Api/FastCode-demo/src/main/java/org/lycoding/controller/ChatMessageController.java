package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @description 存储用户聊天信息
*
* @author Tom
* @date 2024-12-10
**/
	@RestController
@RequestMapping(value = "/chatMessage")
public class ChatMessageController {
@Autowired
	private ChatMessageService chatMessageService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-10
	**/
	@PostMapping( "")
	public Object insert (ChatMessage chatMessage){
		chatMessageService.insert( chatMessage)
	}
}
