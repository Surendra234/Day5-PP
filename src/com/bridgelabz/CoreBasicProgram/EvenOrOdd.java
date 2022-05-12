package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0)
            System.out.println(number +" is an even number");
        else
            System.out.println(number +" is an odd number");
    }
}