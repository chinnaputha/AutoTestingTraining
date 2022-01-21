package com.training.basics;

/**
 * This Class for Constructors
 * 
 * @author Chinna.Putha
 *
 */
public class ConstructorEx {

	String str = "";

	int a;
	float b;
	char c;

	protected ConstructorEx(int a, float b, char c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/*
	 * ConstructorEx(int aa, float bb, char cc){ a=aa; b=bb; c=cc;
	 * 
	 * }
	 */

	public ConstructorEx(String str) {
		this.str = str;
		System.out.println("str value-->" + str);
	}

	public ConstructorEx() {
		System.out.println("ConstructorEx.ConstructorEx()");
	}

	public ConstructorEx(int a, int b) {
		int c = a + b;
		System.out.println("c Value-->" + c);
	}

	public void testAdd() {
		System.out.println("1455");
	}

	public static void main(String[] args) {
		// ConstructorEx ce = new ConstructorEx();
		// ConstructorEx ce2 = new ConstructorEx(10, 15);
		// ConstructorEx ce3 = new ConstructorEx("Hello");
		// ConstructorEx ce4 = new ConstructorEx(10, 10.20f, 'c')
		ConstructorEx ce;
		ce = new ConstructorEx();
		ce = new ConstructorEx("hello");
		ce = new ConstructorEx(10, 15);

		// ce.testAdd();
	}

}
