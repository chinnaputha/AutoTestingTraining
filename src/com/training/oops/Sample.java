package com.training.oops;

/**
 * This Class is an Example of method overloading
 * 
 * @author Chinna.Putha
 *
 */
public class Sample {

	int add(int a, int b) {
		int c = a + b;
		return c;

	}

	int add(int a, int b, int c) {
		int d = a + b + c;
		return d;

	}

	void add() {
		System.out.println("add");

	}
	
	double add(double d, float f) {
		return (d+f);

	}

}
