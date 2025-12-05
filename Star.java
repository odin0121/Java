package com.acharya.classes;

import java.util.*;

public class Star {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the rows");
		int n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*");

			}
			System.out.print("\n");
		}
	}
}
