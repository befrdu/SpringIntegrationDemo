package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDAO;
import com.spring.model.UserDetail;

@Service
public class UserDetailService {
		@Autowired
		UserDAO userDAO;

		public UserDetail getUserDetail(String userName){
			return userDAO.getUserDetails(userName);
		}
}
