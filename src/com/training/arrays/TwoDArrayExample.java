package com.training.arrays;

public class TwoDArrayExample {

	public static void main(String[] args) {
		
		int[][] twoDArr = new int[3][3];
		twoDArr[0][0]=1;
		twoDArr[0][1]=2;
		twoDArr[0][2]=3;
		
		twoDArr[1][0]=4;
		twoDArr[1][1]=5;
		twoDArr[1][2]=6;
		
		twoDArr[2][0]=7;
		twoDArr[2][1]=8;
		twoDArr[2][2]=9;
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(twoDArr[i][j]+" ");//twoDArr[0][0]
												  //twoDArr[0][1]
												  //twoDArr[0][2]
			}//for loop j
			
			System.out.println();
		}

	}

}
