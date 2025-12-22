package com.acharya.labs;
public class Person {

     String name = "Daniel Biju";
     int age = 21;
     int salary = 100000;

 

    public void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }

  public static void main(String[] args) {

        Person per = new Person();
        per.displayDetails();
        System.out.println("Test Successful");

    }

}

