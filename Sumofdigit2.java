package com.acharya.classes;

import java.util.Scanner;

public class Sumofdigit2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number with more than 2 digit");
		int number = sc.nextInt();
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;

		}
		System.out.println(sum);
	}

}