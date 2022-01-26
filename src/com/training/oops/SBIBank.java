package com.training.oops;

public class SBIBank implements Bank {

	@Override
	public void rateOfInterest(int priciple, int time) {
		double roi= (priciple*time*10)/100;
		System.out.println("interest rate SBI-->"+roi);
	}
}
