package com.training.testng;

import org.testng.annotations.Test;

@Test(groups = "Regression")
public class TestNGExample3 {

	@Test
	public void aTest() {
		System.out.println("I am in Atest");
	}
	
	@Test
	public void cTest() {
		System.out.println("I am in Ctest");
	}
	
	@Test
	public void bTest() {
		System.out.println("I am in Btest");
	}
	
	@Test
	public void aaa() {
		System.out.println("AAAAAAAa");
	}
	
	
}

