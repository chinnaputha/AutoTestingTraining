package com.training.basics;

public class SampleTest {
	
	//variables
	int a=10;
	int b=20;
	
	//method
	public void add() {
		int c= a+b;
		System.out.println("c value-->"+c);//30
	}
	

	public static void main(String[] args) {
		System.out.println("Selenium web automation");
		System.out.println("asdfafadfasdfasdfsd");
		SampleTest st = new SampleTest();
		st.add();
		
		ConstructorEx cex = new ConstructorEx(10, 10.11f, 'd');
		
		
	}

}
