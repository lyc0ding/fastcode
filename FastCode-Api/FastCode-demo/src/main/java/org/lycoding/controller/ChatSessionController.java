package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @description 用户会话表
*
* @author Tom
* @date 2024-12-10
**/
	@RestController
@RequestMapping(value = "/chatSession")
public class ChatSessionController {
@Autowired
	private ChatSessionService chatSessionService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-10
	**/
	@PostMapping( "")
	public Object insert (ChatSession chatSession){
		chatSessionService.insert( chatSession)
	}
}