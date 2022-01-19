package com.training.strprograms;

/**
 * This is class to perform string class and string buffer
 * @author Chinna.Putha
 *
 */
public class ProgramsStr {

	public static void main(String[] args) {
		//Strings are immutable, whoose content can't be changed
		String str="java";
		//str.concat("selenium");//java
		str = str.concat("selenium");
		System.out.println(str);
		
		//Strings are mutable, whoose content can be changed
		StringBuffer sb= new StringBuffer("automation");
		sb.append("testing");
		System.out.println(sb);
		
		System.out.println("reverse of string-->"+sb.reverse());
		
	
		
		

	}

}
