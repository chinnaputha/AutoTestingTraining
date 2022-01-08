package com.training.basics;

import com.training.operators.ArithmeticTest;

public class TestExampleDT {

	public static void main(String[] args) {
		System.out.println("I am in Test Example DT class");
		DataTypesExamles2 dtm = new DataTypesExamles2();
		dtm.dataTypesEx();
		System.out.println("Testing comments");
		
		ArithmeticTest att = new ArithmeticTest();
		att.arithmeticOp(44, 12);
	}

}
