package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        // program to print two's power from 0 to 31 times
        System.out.println("Enter the number from 1 to 31 for how many time you want to print the table : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;
        int i = 0;

        if(n >= 0 && n <= 31)
            while (i <= n) {
                power = 2 * power;
                System.out.println(i + " = " + power);
                i++;
            }
        else
            System.out.println("Invalid number");
    }
}