package com.training.oops;

public class LoginOtherUser {
	public static void main(String[] args) {
		LoginTest lt= new LoginTest();
		lt.setUsername("125468@gmail.com");
		lt.setPassowrd("TESRTYU$123");
		System.out.println("USER  "+lt.getUsername());
		System.out.println("PASSWORD  "+lt.getPassowrd());
		
		lt.loginToGmail(lt.getUsername(), lt.getPassowrd());
		
	}

}
