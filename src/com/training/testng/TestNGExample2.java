package com.training.testng;

import org.testng.annotations.Test;

@Test(groups = "Regression")
public class TestNGExample2 {

	@Test(priority = 1)
	public void aTest() {
		System.out.println("Login");
	}
	
	@Test(priority = 0)
	public void cTest() {
		System.out.println("Register");
	}
	
	@Test(priority = 3) //@Test is annotation, priority is annotation attribute
	public void bTest() {
		System.out.println("Logout");
	}
	
	@Test(priority = 2)
	public void aaa() {
		System.out.println("compose email");
	}
	
	
}

