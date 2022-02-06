package com.training.testng;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void login() {
		System.out.println("login to gmail");
	}
	
	@Test
	public void login2() {
		int c=10/0;
	}

}
