package com.training.conflowstats;

//Eclipse shortcuts
//ctrl + shift + X -- upper case
//ctrl + shift + y-- lower case 
public class IfElseIfExample {

	// instance method(non-static)
	// static method
	public static void studentResultStatus(int marks) {
		// >=60 ----First class
		// <60 and >=50 -- second class
		// <50 and >=35 --- thrid class
		// Fail

		if (marks <= 100) {
			if (marks >= 60) {
				System.out.println("FIRST CLASS");
			} else if (marks >= 50 && marks < 60) {
				System.out.println("SENCOND CLASS");
			} else if (marks >= 35 && marks < 50) {
				System.out.println("THRID CLASS");
			} else {
				System.out.println("FAIL");
			}

		} else {
			System.out.println("Marks should not be morethan 100");
		}

	}

	public static void main(String[] args) {
//			IfElseIfExample name = new IfElseIfExample();
//			name.studentResultStatus();
		// call static method --- classname.static method name
		IfElseIfExample.studentResultStatus(189);
	}
}
