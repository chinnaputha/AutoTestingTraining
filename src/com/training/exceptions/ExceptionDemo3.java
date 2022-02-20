package com.training.exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		String a, b;
		int ans = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");

		a = s.next(); // 10
		b = s.next();// abc

		try {
			ans = Integer.parseInt(a) / Integer.parseInt(b);
			System.out.println("answer is-->" + ans);
		} catch (ArithmeticException e) {
			System.out.println("Denominator should not be zero");
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter number instead of string");
			nfe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
