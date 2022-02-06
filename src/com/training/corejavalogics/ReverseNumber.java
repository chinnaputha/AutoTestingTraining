package com.training.corejavalogics;
/**
 * This program is Reverse Number
 * @author Gowri
 */
import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int number = 0;
		int reversenum = 0;
        System.out.println("Input number and press enter:");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        while(number != 0)
        {
        	reversenum = reversenum * 10;
        	reversenum = reversenum + number%10;
        	number = number/10;
        }
        System.out.println("reverse of input number is:" +reversenum);
	}

}
