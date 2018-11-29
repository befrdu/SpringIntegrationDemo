package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Response;
import com.spring.model.UserDetail;
import com.spring.service.UserDetailService;

@RestController
public class UserDetailController {
	@Autowired
	UserDetailService userDetailService;
	
	@RequestMapping(value="/getUserDetail/{userName}", method=RequestMethod.GET)
	public UserDetail getUserDetail(@PathVariable String userName){
		
		return userDetailService.getUserDetail(userName);
	}
	@RequestMapping(value="/saveUserDetail", method=RequestMethod.POST)
	public Response saveUser(@RequestBody UserDetail userDetail){
		
		return new Response(userDetail,200, userDetail.getFirstName()+" is saved");
	}
}

