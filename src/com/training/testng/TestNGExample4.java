package com.training.testng;

import org.testng.annotations.Test;

public class TestNGExample4 {

	@Test(invocationCount = 100)
	public void test() {
		System.out.println("I am in test method");
	}

}
