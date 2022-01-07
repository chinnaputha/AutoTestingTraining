package com.training.basics;

/**
 * This class for Datatypes example
 * 
 * @author Chinna.Putha
 *
 */

//Ctrl + shift + F -- code format
public class DataTypesExamles2 {

	// Primitive data types - 8
	byte b = 0;
	short s = 0;
	int i = 0;
	long l = 0l;
	float f = 0;
	double d = 0;
	char c = 0;
	boolean bo = false;

	// Non primitive data types
	String str = null;
	int[] arr = { 10, 20, 30, 40 };

	/**
	 * Method to print default values of data types
	 */
	public void dataTypesEx() {
		System.out.println("byte default value-->" + b);
		System.out.println("short default value-->" + s);
		System.out.println("int default value-->" + i);
		System.out.println("long default value-->" + l);
		System.out.println("float default value-->" + f);
		System.out.println("double default value-->" + d);
		System.out.println("char default value-->" + c);
		System.out.println("boolean default value-->" + bo);

		System.out.println("String Default value -->" + str);
		System.out.println("Array values -->" + arr[1]);

	}

	public static void main(String[] args) {
		DataTypesExamles2 dtm = new DataTypesExamles2();
		dtm.dataTypesEx();

	}

}
