package com.acharya.classes;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
		public void getSalary() {
		System.out.println("The salary is : "+salary);
	}
	
	public void getName() {
		System.out.println("The name is : "+name);
	}
		
	public static void main(String args[]) {
		
		Employee emp = new Employee(20, "amal", 32339.00);
		System.out.println("Employee id is :"+emp.id);
		emp.getName();
		
		Employee emp1 = new Employee(13, "vinod", 219200.00);
		System.out.println("Employee id is :"+emp1.id);
		emp1.getName();
		
		Employee emp2 = new Employee(10, "vijay", 12332.00);
		System.out.println("Employee id is :"+emp2.id);
		emp2.getName();
		
	}

}
