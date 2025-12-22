package com.acharya.inherit;

public class Superclass {

	String name;
	int num;

	public Superclass(int num) {
		System.out.println("Superclass constructor one para called");
		this.num = num;
	}

	public Superclass(int num, String name) {
		System.out.println("Superclass constructor two para called");
		this.num = num;
		this.name = name;
	}
}
