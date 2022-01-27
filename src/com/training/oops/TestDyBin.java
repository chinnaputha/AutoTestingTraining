package com.training.oops;

import java.util.ArrayList;
import java.util.List;

interface Test {
	
	public void sayHello();
}

public class TestDyBin implements Test{
	@Override
	public void sayHello() {
		System.out.println("Hi Everyone good mrng");
	}
	
	
	public void getDetails() {
		System.out.println("Details displayed");
	}

	public static void main(String[] args) {
//		TestDyBin tdb = new TestDyBin();
//		tdb.sayHello();
//		tdb.getDetails();
		
		Test ti = new TestDyBin();
		ti.sayHello();
		//ti.getDetails();
		
		
		List al = new ArrayList();
		al.add("test");
		
		//List fsdgdf = new List();//List interface - 
		
		//ArrayList al = new ArrayList();
		//al.add("test");

	}

}
