package com.training.basics;

/**
 * Class for Employee details
 * 
 * @author Chinna.Putha
 *
 */
public class Employee {

	// Variables
	String empName;// Declaration
	int empId=456;
	float empSalaray;
	float empSalaray2;

	// methods
	public void empDetails() {
		empName = "Ram";
		empId = 123;
		empSalaray = 12000.32f;

		empSalaray2 = empSalaray * 10;

		System.out.println("Employee Name--->" + empName);
		System.out.println("Employee ID--->" + empId);
		System.out.println("Employee Salary--->" + empSalaray);
		System.out.println("Employee Salary after hike--->" + empSalaray2);
	}

	public static void main(String[] args) {

		// <class name> objectname = new <classname>();
		Employee emp = new Employee();// Object created
		System.out.println("Emp id --->"+emp.empId);
		emp.empDetails();
		

	}

}
