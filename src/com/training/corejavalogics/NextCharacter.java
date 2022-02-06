package com.training.corejavalogics;
/**
 * This class for print next character
 * @author Gowri
 *
 */
public class NextCharacter {

	public static void main(String[] args) {
		String str = "Ashok";
		String str1 = "";
		for (char c : str.toCharArray())
			{
			   str1 += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
			}

			System.out.println(str1);

	}

}
