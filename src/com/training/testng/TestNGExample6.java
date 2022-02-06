package com.training.testng;

import org.testng.annotations.Test;

public class TestNGExample6 {

	@Test
	public void alogin() {
		int c= 10/0;
		System.out.println("Login success failed");
	}
	
	@Test(dependsOnMethods = "alogin")
	public void bcomposeEmail() {
		System.out.println("Composed email");
	}
	
	@Test(dependsOnMethods = "bcomposeEmail")
	public void clogout() {
		System.out.println("Logout");
	}
	
	
	
	
}

