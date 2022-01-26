package com.training.oops;

//Parent class
class BC {
	int a;
	void display() {
		System.out.println("I am in Base/Parent class");
	}
}
//Child class
class DC extends BC {
	
	int b;
	void show() {
		System.out.println("I am in Derived/Child class");
		a=20;
		b=30;
		System.out.println("a value-->"+a);
		System.out.println("b value-->"+b);
	}
	
}

public class InheritanceDemoTest {
	
	public static void main(String[] args) {
		DC d = new DC();
		d.display();
		d.show();
	}

}
