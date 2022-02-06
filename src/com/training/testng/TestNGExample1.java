package com.training.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample1 {

	@BeforeClass
	public void openBrowser() {
		System.out.println("open the browser");
	}
	
	@BeforeMethod
	public void register() {
		System.out.println("Register");
	}

	@Test
	public void Login() {
		System.out.println("Login");
	}

	@Test
	public void Login2() {
		System.out.println("Login2");
	}
	
	@Test
	public void Login3() {
		System.out.println("Login3");
	}


	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("closing the browserr");
	}
}
