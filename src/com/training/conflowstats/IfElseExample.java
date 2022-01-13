package com.training.conflowstats;

/**
 * This class for check if conditios
 * @author Chinna.Putha
 *
 */
public class IfElseExample {
	
	/**
	 * Method for If example
	 * @param age
	 */
	public void isEligibleVote(int age) {
		if(age>=18) {
			System.out.println("Eliigle to vote");
		} 
	}
	
	/**
	 * Method for If Else Example
	 * @param number
	 */
	public void oddEvenCheck(int number) {
		if(number%2 == 0) {
			System.out.println(number+ " is even Number");
		} else {
			System.out.println(number+ " is Odd Number");
		}
	}

	public static void main(String[] args) {
		IfElseExample ie = new IfElseExample();
		ie.isEligibleVote(25);
		ie.oddEvenCheck(19);
		
	}

}
