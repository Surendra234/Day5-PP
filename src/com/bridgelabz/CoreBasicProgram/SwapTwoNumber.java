package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter two number : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before swapping : " +"x" +" = " +x +"  y" +" = " +y);
        // condition of swapping by using third variable
        z = x;
        x = y;
        y = z;
        System.out.println("After swapping : " +"x" +" = " +x +"  y" +" = " +y);
    }
}