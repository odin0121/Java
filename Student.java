package com.acharya.classes;

public class Student {
	int id;
	String firstname;
	String lastname;
	double fees;

	public Student(int id, String firstname, String lastname, double fees) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fees = fees;

	}

	public void getName() {
		System.out.println("Student Name is = " + firstname + lastname);

	}

	public void getFees() {
		System.out.println("Fees of this student is = " + fees);

	}

	public static void main(String args[]) {
		Student st = new Student(10, "Suprith", "Kumar", 10000);
		Student st1 = new Student(11, "Prajwal", "Gurav", 10000);
		Student st2 = new Student(12, "charan", "Teja", 10000);
		Student st3 = new Student(13, "Manoj", "Gowda", 10000);

		st.getName();
		st.getFees();
		st1.getName();
		st1.getFees();
		st2.getName();
		st2.getFees();
		st3.getName();
		st3.getFees();
	}
}
