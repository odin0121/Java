package com.acharya.classes;
import java.util.*;
public class Absolutevalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
		int normalval=sc.nextInt();
		if(normalval<0) {
			int Absoluteval=normalval*-1;
			System.out.println("Absolute Value="+Absoluteval);
		}else {
			System.out.println("Its Already Absolute "+normalval);
		}
	}

}
