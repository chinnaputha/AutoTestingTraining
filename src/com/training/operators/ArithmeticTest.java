package com.training.operators;
/**
 * This class for to perform Arithmetic operations
 * @author Chinna.Putha
 *
 */
public class ArithmeticTest {

	
	
	/**
	 * Method to perform arithmetic operation
	 */
	public void arithmeticOperations() { // method without arguments
		int a=8,b=4;
		System.out.println("********* Method without Arguments **********");
		System.out.println(" a value--->"+a);
		System.out.println(" b value--->"+b);
		System.out.println("a+b -------->"+(a+b));//12
		System.out.println("a-b -------->"+(a-b));//4
		System.out.println("a*b -------->"+(a*b));//32
		System.out.println("a/b -------->"+(a/b));//2
		System.out.println("a%b -------->"+(a%b));//0
	}
	
	public void arithmeticOp(int a, int b) { //method with arguments
		System.out.println("********* Method with Arguments **********");
		System.out.println(" a value--->"+a);
		System.out.println(" b value--->"+b);
		System.out.println("a+b -------->"+(a+b));
		System.out.println("a-b -------->"+(a-b));
		System.out.println("a*b -------->"+(a*b));
		System.out.println("a/b -------->"+(a/b));
		System.out.println("a%b -------->"+(a%b));
	}
	
	public static void main(String[] args) {
		ArithmeticTest at  = new ArithmeticTest();
		at.arithmeticOperations();
		at.arithmeticOp(98,12);
	}

}
