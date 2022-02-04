package com.training.selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {

	public static void listExample() {

		List<String> al = new ArrayList<String>();
		al.add("Ram");
		al.add("Robert");
		al.add("sam");
		al.add("Ram");
		al.add("1111");
		System.out.println("List size-->"+al.size());
		System.out.println("List values-->"+al);
		
		
	}

	public static void  setExample() {
		Set<String> se = new HashSet<String>();
		se.add("Ram");
		se.add("Robert");
		se.add("sam");
		se.add("Ram");
		se.add("1111");
		System.out.println("Set size-->"+se.size());
		System.out.println("Set values-->"+se);
	}

	public static void main(String[] args) {
		listExample();
		setExample();

	}

}
