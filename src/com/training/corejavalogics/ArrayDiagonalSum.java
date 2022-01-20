package com.training.corejavalogics;

public class ArrayDiagonalSum {

	public static void main(String[] args) {
		
		int arrDiagonalSum=0;
		
		int[][] twoDArr = new int[3][3];
		twoDArr[0][0]=1;
		twoDArr[0][1]=2;
		twoDArr[0][2]=3;
		
		twoDArr[1][0]=4;
		twoDArr[1][1]=455;
		twoDArr[1][2]=6;
		
		twoDArr[2][0]=7;
		twoDArr[2][1]=8;
		twoDArr[2][2]=789;
		
		
		for(int i=0;i<3;i++) {
			//arrDiagonalSum =arrDiagonalSum+twoDArr[i][i];
			arrDiagonalSum += twoDArr[i][i];
			
		}
		System.out.println("Diagonal sum-->"+arrDiagonalSum);

	}

}
