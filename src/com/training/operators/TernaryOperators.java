package com.training.operators;

/**
 * This class to perform to ternary operations
 * @author Chinna.Putha
 *
 */
public class TernaryOperators {
	
	/**
	 * Method to check vote eligibiltiy
	 * @param age
	 */
	public void ternaryOperators(int age) {
		
		String voteStatus = (age>=18)?"Eligible to vote":"Note Eligible to vote";
		System.out.println("is Eligigle to vote -->"+voteStatus);
		
		int a,b,value;
		a=10;
		value = (a==1)?20:30;
		System.out.println("status value-->"+value);
		value = (a==10)?20:30;
		System.out.println("status value-->"+value);
		
		
	}

	public static void main(String[] args) {
		TernaryOperators terOp = new TernaryOperators();
		terOp.ternaryOperators(56);
		
	}
}
