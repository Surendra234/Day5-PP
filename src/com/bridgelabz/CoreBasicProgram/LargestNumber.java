package com.bridgelabz;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String [] args) {

        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        x = sc.nextInt();
        System.out.println("Enter second number :");
        y = sc.nextInt();
        System.out.println("Enter third number :");
        z = sc.nextInt();

        if(x>y && x>z)
            System.out.println(x + " is a largest number");

        else if(y>z)
            System.out.println(y + " is a largest number");
        else
            System.out.println(z + " is a largest number");
    }
}