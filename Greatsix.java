package com.acharya.classes;

import java.util.*;

public class Greatsix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int firstvar = sc.nextInt();
		int secondvar = sc.nextInt();
		boolean t;
		if (firstvar == 6 || secondvar == 6 || firstvar + secondvar == 6 || firstvar - secondvar == 6) {
			t = true;
			System.out.print(t);
		} else {
			t = false;
			System.out.print(t);
		}

	}

}
