package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        // Program to print n harmonic number
        System.out.println("Enter the number for how many time you want to print the harmonic series :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double result = 0.0;
        if(number == 0) {
            System.out.println("not a valid input");
        } else {
            for(int i = 1;i <= number;i++) {
                result = (1.0 /i);
                System.out.println(result);
            }
        }
    }
}