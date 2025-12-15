package com.acharya.polyclasses;

import java.util.Scanner;

public class Methodoverload {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Methodoverload over = new Methodoverload();
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);
		System.out.print("Enter a String : ");
		String str = sc.next();
		over.display(num);
		over.display(ch);
		over.display(str);
		sc.close();

	}

	public void display(int num) {
		System.out.print("The Number is " + num);
		System.out.println();
	}

	public void display(char ch) {
		System.out.print("The Character is " + ch);
		System.out.println();

	}

	public void display(String str) {

		System.out.print("The String is " + str);
		System.out.println();

	}
}