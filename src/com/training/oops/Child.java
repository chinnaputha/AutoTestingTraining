package com.training.oops;

class Parent {
	
	int a=10;
	public void display() {
		System.out.println("I am in Parent class");
	}
	
	
}



public class Child extends Parent {
	
	@Override
	public void display() {
		System.out.println("I am in Child class");
		
	}
	
	public  void  show() {
		System.out.println("Child class show method");
	}

	public static void main(String[] args) {
		Parent p= new Child();  // new Child(); ---> child class objec
		p.display();
		//p.show();//will get compile time error
		
		
		Child c= new Child();  // new Child(); ---> child class objec
		c.display();
		c.show();
		

	}

}
