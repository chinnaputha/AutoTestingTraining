package com.training.corejavalogics;

/**
 * This class for swap two numbers with temp or without temp
 * @author Chinna.Putha
 *
 */
public class SwapTwoNumbers {
	
	int a=10;
	int b=20;
	int temp;
	/**
	 * Method to swap two numbers with temp variable
	 */
	public  void withTemp() {
		System.out.println("*******with temp variable*****");
		temp=a;//temp=10
		a=b;//a=20
		b=temp;//b=10
		System.out.println("a value-->"+a);
		System.out.println("b value-->"+b);
	}
	
	/**
	 * Method to swap two numbers without temp variable
	 */
	public  void withOutTemp() {
		System.out.println("*******without temp variable*****");
		a= a+b;//a=30
		b= a-b;//b=30-20 =10
		a= a-b;//b=30-10=20
		System.out.println("a value2-->"+a);
		System.out.println("b value2-->"+b);
	}
	

	public static void main(String[] args) {
		SwapTwoNumbers stn = new SwapTwoNumbers();
		stn.withTemp();
		stn.withOutTemp();

	}

}
