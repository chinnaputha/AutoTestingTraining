package com.training.strprograms;

/**
 * This class to perform String builtin methods
 * @author Chinna.Putha
 *
 */

public class StringMethodsExamples {

	public static void main(String[] args) {
		String str="javaselenium";
		String str2="java";
		String str3="JAVA";
		String str4="selenium is web automation tool";
		
		String str5="   TestNG is unit testing framework    ";
		String str6="TestNG is unit testing framework";
		
		System.out.println("length of the string-->"+str.length());//12
		System.out.println("chat at method-->"+str.charAt(4));//s
		System.out.println("Upper case letters-->"+str.toUpperCase());
		System.out.println("lower case letters-->"+str.toLowerCase());
		System.out.println("equals method -->"+str2.equals(str3));//false
		System.out.println("equalsignorecase method -->"+str2.equalsIgnoreCase(str3));//false
		
		System.out.println("starts with--->"+str4.startsWith("selenium"));
		System.out.println("ends with--->"+str4.endsWith("tool"));
		System.out.println("contains --->"+str4.contains("web"));
		
		System.out.println("trim method -->"+str5.trim().equals(str6));//false
		
		System.out.println("substring with begin index --->"+str4.substring(4));
		System.out.println("substring with begin and end index--->"+str4.substring(4,10));
		
		System.out.println("replace method --->"+str6.replace("TestNG", "Junit"));
		

	}

}
