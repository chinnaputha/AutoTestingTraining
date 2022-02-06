package com.training.corejavalogics;

import java.util.HashMap;

/**
 * This program to print string occurrence
 * @author Gowri
 *
 */
public class StringOccurrence {

	public static void main(String[] args) {
		String str2 = "java is java";
		HashMap<String, Integer> map = new HashMap<>();		
		map.put("java", 2);
        map.put("is", 1);
		System.out.println(map);
		//System.out.println("is="+map);
			}
}

