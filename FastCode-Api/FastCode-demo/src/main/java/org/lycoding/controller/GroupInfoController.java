package org.lycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @description 群聊信息表
*
* @author Tom
* @date 2024-12-10
**/
	@RestController
@RequestMapping(value = "/groupInfo")
public class GroupInfoController {
@Autowired
	private GroupInfoService groupInfoService;
	/**
	* @description 新增
	* @author Tom
	* @date 2024-12-10
	**/
	@PostMapping( "")
	public Object insert (GroupInfo groupInfo){
		groupInfoService.insert( groupInfo)
	}
}