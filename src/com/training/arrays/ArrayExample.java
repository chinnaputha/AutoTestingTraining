package com.training.arrays;

public class ArrayExample {
	
	

	public static void main(String[] args) {
		
		int a=10,b=20,c=30,d=40;
		String s1="hello",s2="selenium",s3="java";
		
		int[] arrayInt= {10,20,30,40,50,60,70};//declaration cum intialization
		// or
		int[] arr = new int[5];//declaration
		arr[0]=111;//intialization
		arr[1]=222;
		arr[2]=333;//intialization
		arr[3]=444;
		arr[4]=555;//intialization
		arr[5]=666;
		
		String strArray[] = {"hello","selenium","java"};
		
		System.out.println("length of arrayInt -->"+arrayInt.length);//5
		System.out.println("length of strArray -->"+strArray.length);//3
		//print array values using loop
		for(int i=0;i<arrayInt.length;i++) {
			System.out.println(arrayInt[i]);
		}
		
		
		

	}

}
