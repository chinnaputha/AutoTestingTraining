package com.training.testng;

import org.testng.annotations.Test;


@Test(groups = "Regression")
public class TestNGExample5 {

	@Test
	public void aTest() {
		System.out.println("I am in Atest");
	}
	
	@Test
	public void cTest() {
		System.out.println("I am in Ctest");
	}
	
	@Test(enabled = false)
	public void bTest() {
		System.out.println("I am in Btest");
	}
	
	@Test
	public void aaa() {
		System.out.println("AAAAAAAa");
	}
	
	@Test
	public void bbb() {
		System.out.println("BBBBBB");
	}
	
	
}

