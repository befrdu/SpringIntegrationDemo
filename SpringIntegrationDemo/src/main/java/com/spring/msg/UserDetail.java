package com.spring.msg;

public class UserDetail {
	private String userName;
	private String firstName;
	private String lastName;
	private String ssn;
	private String phoneNubmer;
	private Address address;
	private boolean identityVerified;
		
	public boolean isIdentityVerified() {
		return identityVerified;
	}
	public void setIdentityVerified(boolean identityVerified) {
		this.identityVerified = identityVerified;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNubmer() {
		return phoneNubmer;
	}
	public void setPhoneNubmer(String phoneNubmer) {
		this.phoneNubmer = phoneNubmer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
