package com.acharya.labs;

public class Employee {
protected int id;
protected int age;
protected String name;
protected boolean isPermanent;



public void displayDetails() {

    System.out.println("Employee Id: " + id);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Age: " + age);
    System.out.println("Is Employee Permanent: " + isPermanent);

}



public static void main(String[] args) {

    Employee emp = new Employee();

   
    emp.age = (int) 35.5;
    emp.id = 200;
    emp.name = "Daniel";
    emp.isPermanent = true;
    emp.displayDetails();

    System.out.println("Successfully started");

}





}


