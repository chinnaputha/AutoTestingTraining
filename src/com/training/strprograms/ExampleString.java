package com.training.strprograms;

public class ExampleString {

	public static void main(String[] args) {
		char c='a';
		String st= "selenium";//String literal -- String constanct pool -- ab14
		String st2= new String("selenium");//String object -- heap memory -- ab15
		String st4= new String("selenium");//String object -- heap memory -- ab16
		
		String st3= "selenium";
		
		System.out.println("st value-->"+st);
		System.out.println("st2 value-->"+st2);

		
		//String comparision ==, equals
		
		System.out.println("st == st2-->"+(st == st2));//false
		System.out.println("st equals st2-->"+(st.equals(st2)));//true
		System.out.println("st == st3-->"+(st == st3));//true
		
		System.out.println("st2 == st4-->"+(st2 == st4));//false
	}

}
