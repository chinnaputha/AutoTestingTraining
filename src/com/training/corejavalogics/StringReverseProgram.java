package com.training.corejavalogics;

public class StringReverseProgram {

	public void stringWithoutReverse(String str) {
		String rev_string = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev_string += str.charAt(i);
		} // for loop end
		System.out.println("reverse string without revese-->" + rev_string);

	}

	public void stringWithReverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println("SB reverse()--->" + sb.reverse());

	}

	public void wordsReverse(String str) {
		String[] words = str.split(" ");
		System.out.println("Total words in given sentence-->"+words.length);
		System.out.println("array words-->"+words[3]);
		
		//int a=10,b=20,c=30;
		//int[] arr= {1,2,3,456};
		//System.out.println(arr[1]);
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.println(words[i]);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		StringReverseProgram srp = new StringReverseProgram();
		srp.stringWithoutReverse("java selenium");
		srp.stringWithReverse("java selenium");
		srp.wordsReverse("I Love My India");
	}

}
