package com.training.conflowstats;

public class StaticInstance {

	int age = 55;
	int a = 10; // instance variable
	static String str = "Selenium web automation";// static variable

	// instance method
	public int getAge() {
		return 14;
	}

	// static method
	public static String printName() {
		return "this is static method";

	}

	public static void test() {
		System.out.println("testing");
	}

	public void sample() {
		int a = 20;//local variable
		System.out.println("a value --->"+a);
	}

	public static void main(String[] args) {
		StaticInstance si = new StaticInstance();
		System.out.println("Instance variable -->" + si.a);// calling instance variable
		System.out.println("instance method--->" + si.getAge() * 10);// calling instace method

		si.sample();//a=

		System.out.println("static variable -->" + StaticInstance.str);// calling static variable
		System.out.println("static method -->" + StaticInstance.printName());// calling static method

	}

}
