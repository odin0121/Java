package com.acharya.polyclasses;

public class Polymorphismdemo {
	public static void main(String args[]) {
		Polymorphismdemo demo = new Polymorphismdemo();
		System.out.print("area of Square is " + demo.area(12));
		System.out.println();
		System.out.print("area of Rectangle is " + demo.area(15, 20));
		System.out.println();
		System.out.print("area of Circle is " + demo.area(15.00));
	}

	public int area(int side) {
		int area = side * side;
		return area;
	}

	public int area(int length, int breadth) {
		int area = length * breadth;
		return area;
	}

	public double area(double radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
}
