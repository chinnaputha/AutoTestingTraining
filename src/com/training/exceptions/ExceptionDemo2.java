package com.training.exceptions;

import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("c value-->" + c);
		} catch (Exception e) {
			System.out.println("Demoninator should not be zero");
			e.printStackTrace();
			
		}
	}

}
