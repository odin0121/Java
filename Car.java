package com.acharya.labs;

public class Car {

	private String make;
	private String model;
	private short year;
	private int price;

	public Car(String make, String model, short year, int price) {

		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;

	}

	public void displayDetails() {

		System.out.println("The Car Make: " + make);
		System.out.println("The Car Model: " + model);
		System.out.println("The Car Year: " + year);
		System.out.println("The Car Price: " + price + "Rs");

	}

	public static void main(String[] args) {

		Car car1 = new Car("Honda", "City", (short) 2019, 30000);
		Car car2 = new Car("Honda", "Jazz", (short) 2021,50000);

		System.out.println("Details of Car 1:");

		car1.displayDetails();
		System.out.println();

		System.out.println("Details of Car 2:");

		car2.displayDetails();

	}

}