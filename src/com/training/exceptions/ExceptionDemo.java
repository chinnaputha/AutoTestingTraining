package com.training.exceptions;

import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("c value-->" + c);
		} catch (NumberFormatException nfe) {
			System.out.println("Plese enter valid number");
			nfe.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("Denominator should not be zero");
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println("into catch block");
			e.printStackTrace();
		} finally {
			System.out.println("i am in finally block");
		}

	}

}
