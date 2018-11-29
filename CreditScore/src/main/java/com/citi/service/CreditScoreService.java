package com.citi.service;

import org.springframework.stereotype.Service;

import com.citi.model.CreditScoreRequest;
import com.citi.model.CreditScoreResponse;

@Service
public class CreditScoreService {
	public CreditScoreResponse getCreditScore(CreditScoreRequest request){
		CreditScoreResponse response=new CreditScoreResponse();
		response.setName(request.getName());
		response.setScore(665);
		response.setSsn(request.getSsn());
		response.setStatus("Active");
		
		return response;
	}
}
