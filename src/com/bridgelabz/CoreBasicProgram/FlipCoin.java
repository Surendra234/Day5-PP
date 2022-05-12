package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Enter that number how many time you want to flip the coin : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        float head = 0, tail = 0;

        for (int i = 0; i < input; i++) {
            if (Math.random() < 0.5)
                head++;
            else
                tail++;
        }
        System.out.println("Head : " + head);
        System.out.println("Tail : " + tail);
        float headPercentage = (head / input) * 100;
        float tailPercentage = (tail / input) * 100;
        System.out.println("Head percentage : " + headPercentage + " %");
        System.out.println("Tail percentage : " + tailPercentage + " %");
    }
}