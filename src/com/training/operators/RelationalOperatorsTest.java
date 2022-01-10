package com.training.operators;

/**
 * This class for to perform Relational operations
 * 
 * @author Chinna.Putha
 *
 */
public class RelationalOperatorsTest {

	/**
	 * Method to perform relational operators
	 */
	public void relationalOperations() { // method without arguments
		int a=8;
		int b=4;
		System.out.println("********* Method without Arguments **********");
		System.out.println(" a value--->" + a); //8
		System.out.println(" b value--->" + b); //4
		System.out.println("a<b-------->" + (a < b)); //8<4 --- false
		System.out.println("a<=10 -------->" + (a<=10));//8<=10 ---true
		System.out.println("a>b -------->" + (a > b));//8>4 --- true
		System.out.println("a>=b -------->" + (a >= b));//8>=4 -- true
		System.out.println("a!=4 -------->" + (a != 4));// 8 ! = 4 -- true
	}

	// Single line Comment - Ctrl + /
	// Multi line comment -- Ctrl + Shift + /
	// Multi line uncomment -- Ctrl + Shift + \
    // /**   * 
	
	public void relationaOp(int a, int b) { // method with arguments
		System.out.println("********* Method with Arguments **********");
		System.out.println(" a value--->" + a); //8
		System.out.println(" b value--->" + b); //4
		System.out.println(a+"<"+b+"-------->" + (a < b)); //8<4 --- false
		System.out.println("a<=10 -------->" + (a<=10));//8<=10 ---true
		System.out.println("a>b -------->" + (a > b));//8>4 --- true
		System.out.println("a>=b -------->" + (a >= b));//8>=4 -- true
		System.out.println("a!=4 -------->" + (a != 4));// 8 ! = 4 -- true
		
//		String aa="2556";
//		String bb="1000"; 
//		//Integer.parseInt(s)
//		System.out.println(aa+bb);//25561000
//		System.out.println(Integer.parseInt(aa)+Integer.parseInt(bb));//30
	}
	

	public static void main(String[] args) {
		RelationalOperatorsTest relOp = new RelationalOperatorsTest();
		relOp.relationalOperations();
		relOp.relationaOp(100, 200);
	}

}
