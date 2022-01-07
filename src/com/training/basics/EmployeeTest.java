package com.training.basics;

/**
 * Class for Employee details 
 * 
 * @author Chinna.Putha
 *
 */
public class EmployeeTest {
	
	// Variables
	int empId=789;
	float empSalaray=4500.12f;
	String empName="Sam";// Declaration cum initialization
	
	// methods
	public void empDetails() {
		System.out.println("EMP NAME "+empName);
		System.out.println("EMP ID "+empId);
		System.out.println("EMP SALARAY "+empSalaray);
	}
	
	public int empCompany() {
		System.out.println("1111111");
		return 4569;
	}
	
	public static void main(String[] args) {
		EmployeeTest emp = new EmployeeTest();// Object created
		emp.empDetails();
		int empC=emp.empCompany();
		System.out.println(" return value-->"+empC);

	}


	

}
