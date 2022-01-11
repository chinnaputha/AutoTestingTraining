package com.training.operators;

/**
 * This class to perform to assignment operations
 * @author Chinna.Putha
 *
 */
public class AssignmentOperators {
	
	/**
	 * Method to perform assignment opeartors
	 */
	public void asssignmentOperators() {
		int a=8,b=4;
		System.out.println(" a value before-->"+a);
		System.out.println("a+=b  or a= a+b----->"+(a+=b));//12
		System.out.println("a-=3  or a= a-3----->"+(a-=3));//9
		System.out.println("a*=7  or a= a*7----->"+(a*=7));//9*7 == 63
		System.out.println("a/=b  or a= a/b----->"+(a/=b));//63/4 --15
		System.out.println("a%=5  or a= a%5----->"+(a%=5));//15/5 --0
	}
	
	
	public void isEligileToVote(int age) {
		if(age>=18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not Eligible to vote");
		}
		
	}
	
	public static void main(String[] args) {
		AssignmentOperators assinOp = new AssignmentOperators();
		assinOp.asssignmentOperators();
		assinOp.isEligileToVote(34);
		
	}
}
