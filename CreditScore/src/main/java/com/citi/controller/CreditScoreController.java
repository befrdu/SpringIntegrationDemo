package com.citi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citi.model.CreditScoreRequest;
import com.citi.model.CreditScoreResponse;
import com.citi.service.CreditScoreService;

@RestController
public class CreditScoreController {
	@Autowired
	CreditScoreService creditService;
	
	@RequestMapping(value="/getCreditCScore", method=RequestMethod.POST)
	public CreditScoreResponse getCreditScore(@RequestBody CreditScoreRequest request){
		return creditService.getCreditScore(request);
	}
}
