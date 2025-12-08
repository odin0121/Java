package com.acharya.classes;

import java.util.*;

public class ArrayTwoMatrix {
  public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				int arr[][] = new int[2][2];
				int arr2[][]=new int[2][2];
				int sum[][]=new int[2][2];
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print("enter elements of array 1 row :" + (i + 1) + " and column : " + (j + 1) +" =");
						arr[i][j] = sc.nextInt();
					}
				}
				for (int i = 0; i < arr2.length; i++) {
					for (int j = 0; j < arr2[i].length; j++) {
						System.out.print("enter elements of array 2 row : " + (i + 1) + " and column : " + (j + 1) +" =");
						arr2[i][j] = sc.nextInt();
					}
				}
				
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						
						sum[i][j]=arr[i][j]+arr2[i][j];
						System.out.print(sum[i][j]+" ");
					}
					System.out.println(" ");
				}
			}

		

}


