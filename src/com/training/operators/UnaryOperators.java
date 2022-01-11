package com.training.operators;

/**
 * This class to perform to Unary operations
 * @author Chinna.Putha
 *
 */
public class UnaryOperators {
	
	/**
	 * Method to check increment and decrement
	 *
	 */
	public void unaryOperators() {
		int age=18;
		//++ --- increment
		//--  ---> decrement
		System.out.println("Age1 pre increment-->"+(++age));//19
		System.out.println("Age2 post increment-->"+(age++));//19
		System.out.println("Age current value-->"+age);
		
		System.out.println("Age1 pre decrement-->"+(--age));//19
		System.out.println("Age2 post decrement-->"+(age--));//19
		System.out.println("Age current value-->"+age);//18
	}

	public static void main(String[] args) {
		UnaryOperators unOp = new UnaryOperators();
		unOp.unaryOperators();
		
	}
}
