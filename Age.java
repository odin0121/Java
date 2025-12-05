package com.acharya.classes;

import java.util.*;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter age");
		int age = sc.nextInt();
		if(age>=0 && age<=12) {
		System.out.print("KID");
			
		}else if(age>=13 && age<=19) {
			System.out.print("Teenager");
			
			}else if(age>=20 && age<=40) {
				System.out.print("Youngster");
				
			}else  if(age>=41 && age<=55) {
				System.out.print("Aged man");
				
			}else if(age>=56 && age<=70) {
				System.out.print("Old man");
				
			}else {
				System.out.print("Invalid");
			}

	}

}
