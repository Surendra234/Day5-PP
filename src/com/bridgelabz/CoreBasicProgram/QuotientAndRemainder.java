package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("Enter two number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Quotient " + quotient);
        System.out.println("Remainder " + remainder);
    }
}
