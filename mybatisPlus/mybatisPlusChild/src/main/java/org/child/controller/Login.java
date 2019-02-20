package org.child.controller;

import org.child.entity.UUser;
import org.child.mapper.UUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/Login")
public class Login {
	@Autowired
	UUserMapper uUserMapper;
@ResponseBody
@RequestMapping("/index")
public UUser index(){
	return uUserMapper.select();
}
}
