package com.acharya.classes;

import java.util.*;

public class Studentobj {
	int id;
	String name;
	double fees;

	public Studentobj(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public double getFees() {
		return fees;
	}

	public String getName() {
		return name;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of students");
		int size = sc.nextInt();
		Studentobj stud[] = new Studentobj[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Details of Student " + (i + 1) + " ");
			System.out.println("Enter ID");
			int id = sc.nextInt();
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter fees");
			double fees = sc.nextDouble();

			stud[i] = new Studentobj(id, name, fees);
			
		}
		System.out.println("Student Details");
		for (Studentobj stu : stud) {
			System.out.println("ID is :" + stu.id + " Name is : " + stu.name + " Fees is : " + stu.fees);
			System.out.println();

		}
		sc.close();

	}
}
