package com.training.oops;

public class AxisBank implements Bank{

	@Override
	public void rateOfInterest(int priciple, int time) {
		double roi= (priciple*time*12)/100;
		System.out.println("interest rate Axis Bank -->"+roi);
	}

	
}
