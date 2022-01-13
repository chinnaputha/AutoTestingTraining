package com.training.operators;

/**
 * Class to perform all opertators exampels
 * 
 * @author Chinna.Putha
 *
 */
public class AllOperators {

	public void arithmeticOp(int a, int b) { // method with arguments
		System.out.println("------------Arithmetic Opeatiors ---------");
		System.out.println("********* Method with Arguments **********");
		System.out.println(" a value--->" + a);
		System.out.println(" b value--->" + b);
		System.out.println("a+b -------->" + (a + b));
		System.out.println("a-b -------->" + (a - b));
		System.out.println("a*b -------->" + (a * b));
		System.out.println("a/b -------->" + (a / b));
		System.out.println("a%b -------->" + (a % b));
	}

	public void asssignmentOperators() {
		System.out.println("------------Assignment Opeatiors ---------");
		//Log4j
		int a = 8, b = 4;
		System.out.println(" a value before-->" + a);
		System.out.println("a+=b  or a= a+b----->" + (a += b));// 12
		System.out.println("a-=3  or a= a-3----->" + (a -= 3));// 9
		System.out.println("a*=7  or a= a*7----->" + (a *= 7));// 9*7 == 63
		System.out.println("a/=b  or a= a/b----->" + (a /= b));// 63/4 --15
		System.out.println("a%=5  or a= a%5----->" + (a %= 5));// 15/5 --0
	}

	public void logicalOp() {
		int a = 8, b = 4, c = -10;

		boolean result = ((a < b) && (b > c));
		System.out.println("(a<b) && (b>c) ----->" + ((a < b) && (b > c)));// false
		System.out.println("(a<b) && (b>c) ----->" + result);// false
		System.out.println("(a<b) || (b>c) ----->" + ((a < b) || (b > c)));// true
		System.out.println(" (b!=-c || (a==b)---->" + ((b != -c) || (a == b))); // true
		System.out.println(" !(b<=-a)---->" + (!(b <= -a))); // !false -- true

	}

	public void relationaOp(int a, int b) { // method with arguments
		System.out.println("********* Method with Arguments **********");
		System.out.println(" a value--->" + a); // 8
		System.out.println(" b value--->" + b); // 4
		System.out.println(a + "<" + b + "-------->" + (a < b)); // 8<4 --- false
		System.out.println("a<=10 -------->" + (a <= 10));// 8<=10 ---true
		System.out.println("a>b -------->" + (a > b));// 8>4 --- true
		System.out.println("a>=b -------->" + (a >= b));// 8>=4 -- true
		System.out.println("a!=4 -------->" + (a != 4));// 8 ! = 4 -- true

	}

	/**
	 * Method to check vote eligibiltiy
	 * 
	 * @param age
	 */
	public void ternaryOperators(int age) {

		String voteStatus = (age >= 18) ? "Eligible to vote" : "Note Eligible to vote";
		System.out.println("is Eligigle to vote -->" + voteStatus);

		int a, b, value;
		a = 10;
		value = (a == 1) ? 20 : 30;
		System.out.println("status value-->" + value);
		value = (a == 10) ? 20 : 30;
		System.out.println("status value-->" + value);

	}

	/**
	 * Method to check increment and decrement
	 *
	 */
	public void unaryOperators() {
		int age = 18;
		// ++ --- increment
		// -- ---> decrement
		System.out.println("Age1 pre increment-->" + (++age));// 19
		System.out.println("Age2 post increment-->" + (age++));// 19
		System.out.println("Age current value-->" + age);

		System.out.println("Age1 pre decrement-->" + (--age));// 19
		System.out.println("Age2 post decrement-->" + (age--));// 19
		System.out.println("Age current value-->" + age);// 18
	}

	public static void main(String[] args) {
		AllOperators allOp = new AllOperators();
		allOp.arithmeticOp(10, 20);
		allOp.asssignmentOperators();
		allOp.relationaOp(14, 48);
		allOp.ternaryOperators(44);
		allOp.unaryOperators();
	}

}
