package com.training.oops;

public class MethodOverridingExample {
	public static void main(String[] args) {

		SBIBank sb = new SBIBank();
		sb.rateOfInterest(100000, 120);

		AxisBank ab = new AxisBank();
		ab.rateOfInterest(100000, 12);

		ICICIBank ib = new ICICIBank();
		ib.rateOfInterest(100000, 12);
	}

}
