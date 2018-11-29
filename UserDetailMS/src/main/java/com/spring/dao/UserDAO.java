package com.spring.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.spring.model.Address;
import com.spring.model.UserDetail;

@Repository
public class UserDAO {
	
	public UserDetail getUserDetails(String userName){
		Map<String, UserDetail>userDetailMap=getAllUserDetails();
		return userDetailMap.get(userName);
	}
	private Map<String,UserDetail> getAllUserDetails(){
		Map<String, UserDetail>userDetailMap=new HashMap<String, UserDetail>();
		
		Address address =new Address();
		address.setCity("Addison");
		address.setStreetName("4560 Westgrove dr");
		address.setZipCode("75001");
		address.setState("Texas");
		address.setCountry("USA");
		
		UserDetail userDetail=new UserDetail();
		userDetail.setUserName("befrdu");
		userDetail.setFirstName("Befrdu");
		userDetail.setLastName("Gebreamlack");
		userDetail.setPhoneNubmer("450-562-6632");
		userDetail.setSsn("414-65-9952");
		userDetail.setAddress(address);
		userDetail.setIdentityVerified(false);
		
		UserDetail userDetail2=new UserDetail();
		userDetail2.setUserName("zewdu");
		userDetail2.setFirstName("Zewdu");
		userDetail2.setLastName("Demissie");
		userDetail2.setSsn("414-65-9952");
		userDetail2.setPhoneNubmer("450-562-6632");
		userDetail2.setAddress(address);
		userDetail2.setIdentityVerified(false);
		
		UserDetail userDetail3=new UserDetail();
		userDetail3.setUserName("john");
		userDetail3.setFirstName("John");
		userDetail3.setLastName("Bob");
		userDetail3.setSsn("414-65-9952");
		userDetail3.setPhoneNubmer("450-562-6632");
		userDetail3.setAddress(address);
		userDetail3.setIdentityVerified(false);
		
		UserDetail userDetail4=new UserDetail();
		userDetail4.setUserName("mike");
		userDetail4.setFirstName("Micheal");
		userDetail4.setLastName("Peter");
		userDetail4.setSsn("414-65-9952");
		userDetail4.setPhoneNubmer("450-562-6632");
		userDetail4.setAddress(address);
		userDetail4.setIdentityVerified(false);
		
		userDetailMap.put(userDetail.getUserName(), userDetail);
		userDetailMap.put(userDetail2.getUserName(), userDetail2);
		userDetailMap.put(userDetail3.getUserName(), userDetail3);
		userDetailMap.put(userDetail4.getUserName(), userDetail4);
		
		return userDetailMap;
	}
}
