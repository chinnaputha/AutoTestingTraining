package com.training.oops;

public class GitCodePush {
	
	private String userName;
	private String accessToken;
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getUserName() {
		System.out.println("username value--->"+userName);
		return userName;
	}
	
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	
	
	
	
	

}
