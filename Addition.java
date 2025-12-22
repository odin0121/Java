package com.acharya.labs;


class Calculator {

    static double sum;  

    public static void add(int a, int b) {
        sum = a + b;
        display();
    }

    public static void add(int a, int b, int c) {
        sum = a + b + c;
        display();
    }

    public static void add(double a, double b, double c) {
        sum = a + b + c;
        display();
    }

    public static void display() {
        System.out.println(sum);
    }
}

public class Addition {
    public static void main(String[] args) {

        Calculator.add(1, 3);
        Calculator.add(0, 0, 0);
        Calculator.add(2.5, 3.5, 4.0);
    }
}

