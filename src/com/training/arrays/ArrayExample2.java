package com.training.arrays;

import java.util.ArrayList;

public class ArrayExample2 {
	
	public static void arraySum() {
		int[] arrV= {11,22,33,44};
		int arrSum = 0;
		
		for(int i=0;i<arrV.length;i++) {
			arrSum = arrSum+arrV[i];
		}
		System.out.println("array sum-->"+arrSum);
	}

	public static void main(String[] args) {
		ArrayExample2.arraySum();
		int[] arr = new int[100];// declaration

		// adding values to arr
		for (int i = 0; i < 100; i++) {
			arr[i] = i;
		}

		// print array values
		for (int i = 0; i < 100; i++) {
			System.out.println(arr[i]);
		}

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(400);
		System.out.println("arraylist values-->" + al);

		for (int i = 0; i < 500; i++) {
			al.add(i);
		}

		System.out.println("arraylist values-->" + al);

		ArrayList al2 = new ArrayList();
		al2.add("selenium");// 0 index
		al2.add('c');
		al2.add(167);
		al2.add(false);
		al2.add("selenium");

		System.out.println("arraylist2 values-->" + al2);
		System.out.println("get specific value-->" + al2.get(2));// 167
	}

}
