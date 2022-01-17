package com.training.conflowstats;

public class SwitchExample {
	
	/**
	 * method with out using switch statment
	 * @param month
	 */
	public void withoutSwithstamt(int month) {
		
		if(month == 1) {
			System.out.println("Jan");
		} else if (month ==2) {
			System.out.println("Feb");
		} else {
			System.out.println("invalid");
		}
		
	}
	
	/**
	 * Method using swith statement
	 * @param month
	 */
	public void printMonthName(int month) {
		switch (month) {
		case 1:
			System.out.println("JANUARY");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;

		default:
			System.out.println("INVALID MONTH");
		
		}
		
	}

	public static void main(String[] args) {
		SwitchExample se = new SwitchExample();
	//	se.printMonthName(2);
		se.withoutSwithstamt(1);
	}

}
