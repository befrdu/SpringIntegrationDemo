package com.spring.msg;

public class Response {
	private int errorCode;
	private String message;
	private UserDetail userDetail;
	
	public Response(){
		
	}
	@Override
	public String toString() {
		return "Response [errorCode=" + errorCode + ", message=" + message + ", userDetail=" + userDetail + "]";
	}
	public Response(UserDetail userDetail, int errorCode, String message){
		this.errorCode=errorCode;
		this.userDetail=userDetail;
		this.message=message;
	}
	
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
