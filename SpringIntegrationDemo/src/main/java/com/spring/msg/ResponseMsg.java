package com.spring.msg;

public class ResponseMsg {

	private String currentTime;
	private UserDetail userDetail;
	
	public ResponseMsg(){}
	
	public ResponseMsg(UserDetail msg, String currentTime){
		this.userDetail = msg;
		this.currentTime = currentTime;
	}
	
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setMsg(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	public String getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
}