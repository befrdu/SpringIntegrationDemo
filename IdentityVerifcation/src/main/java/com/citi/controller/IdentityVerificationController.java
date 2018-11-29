package com.citi.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citi.model.UserDetail;

@RestController
public class IdentityVerificationController {
	@RequestMapping(value="/verify",method=RequestMethod.POST)
	public UserDetail verifyUser(@RequestBody UserDetail userDetail){
		userDetail.setIdentityVerified(true);
		return userDetail;
	}
}
