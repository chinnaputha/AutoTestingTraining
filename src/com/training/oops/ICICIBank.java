package com.training.oops;

public class ICICIBank implements Bank{

	public void rateOfInterest(int priciple, int time) {
		double roi= (priciple*time*13)/100;
		System.out.println("interest rate ICICI-->"+roi);
		
	}


}
