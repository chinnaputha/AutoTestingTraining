package com.training.operators;

/**
 * This class to perform to logical operations
 * @author Chinna.Putha
 *
 */
public class LogicalOperatorsTest {
	
	public void logicalOp() {
		int a=8,b=4,c=-10;

		boolean result = ((a<b)&&(b>c));
		System.out.println("(a<b) && (b>c) ----->"+((a<b)&&(b>c)));//false
		System.out.println("(a<b) && (b>c) ----->"+result);//false
		System.out.println("(a<b) || (b>c) ----->"+((a<b)||(b>c)));//true
		System.out.println(" (b!=-c || (a==b)---->"+((b!=-c) || (a==b))); //true
		System.out.println(" !(b<=-a)---->"+(!(b<=-a))); //!false -- true
		
	}
	
	public static void main(String[] args) {
		LogicalOperatorsTest lot = new LogicalOperatorsTest();
		lot.logicalOp();
		
	}
}
