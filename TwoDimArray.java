package com.acharya.classes;

import java.util.*;

public class TwoDimArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("enter elements of row :" + (i + 1) + " and column : " + (j + 1) +" =");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
