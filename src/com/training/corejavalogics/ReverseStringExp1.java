package com.training.corejavalogics;

import java.util.Scanner;

/**
 * String reverse with built method and without built in method
 * @author Gowri
 *
 */
public class ReverseStringExp1 {

	public static void main(String[] args) {
		int i,n;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		s=sc.nextLine();
		char str[] = s.toCharArray();
		n = str.length;
		System.out.println("Reverse String is:");
		for(i=n-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
	}


}
