package com.acharya.labs;

public class Rectangle {

	double width;
	double height;

	enum Color {
		RED, GREEN, BLUE

	}

	Color boxColor;

	public double calculateArea() {

		return width * height;

	}

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();

		rect.width = 20.5;

		rect.height = 10.9;

		rect.boxColor = Color.BLUE;

		System.out.println("Width is - " + rect.width);

		System.out.println("Height is - " + rect.height);

		System.out.println("Area is - " + rect.calculateArea());

		System.out.println("Box Color is - " + Color.BLUE);

	}

}
