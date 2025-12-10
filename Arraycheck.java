package com.acharya.classes;

import java.util.*;

public class Arraycheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("enter elements of row :" + (i + 1) + " and column : " + (j + 1) + " = ");
				arr[i][j] = sc.nextInt();
			}
		}
		int flag = 0;
		int flag2 = 0;
		int flag3 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] >= 1 && arr[i][j] <= 50) {

					flag++;
				}
				if (arr[i][j] >= 51 && arr[i][j] <= 100) {

					flag2++;
				}
				if (arr[i][j] > 100) {

					flag3++;

				}
			}
		}

		System.out.println("In the above array there are number " + flag + " between 1 to 50");

		System.out.println("In the above array there are number " + flag2 + " between 50 to 100");

		System.out.println("In the above array there are number " + flag3 + " above 100");
	}

}
