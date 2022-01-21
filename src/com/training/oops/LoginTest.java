package com.training.oops;

/**
 * This Class for Example of Encapusalation
 * 
 * @author Chinna.Putha
 *
 */
public class LoginTest {

	private String username = "javatset@gmail.com";
	private String passowrd = "Tsting@123";

	// Set user name
	public void setUsername(String username) {
		this.username = username;
	}

	// get the username
	public String getUsername() {
		return username;
	}

	// set your password
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	// get your password
	public String getPassowrd() {
		return passowrd;
	}

	public void loginToGmail(String user,String pwd) {
		System.out.println("111111111111111111");
		System.out.println("username-->" + user);
		System.out.println("passowrd-->" + pwd);
		System.out.println("Login succesfull");
	}

	public static void main(String[] args) {
		LoginTest lt = new LoginTest();
		// lt.loginToGmail();
	}

}
