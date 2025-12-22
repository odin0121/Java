package com.acharya.inherit;

public class Subclass extends Superclass {
	int num;
	String name;

	public Subclass(int num) {
		super(12);
		this.num = num;

	}

	public Subclass(int num, String name) {
		super(12, "Daniel");
		this.num = num;
		this.name = name;
	}
}
