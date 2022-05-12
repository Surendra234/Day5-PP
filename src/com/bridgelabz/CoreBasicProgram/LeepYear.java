package com.bridgelabz;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        System.out.println("Enter the year which you want to check is leep year or not : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leep;

        if(year % 4 == 0) {               // if year divided by 4
            if (year % 100 == 0) {        // if year is a century
                if (year % 400 == 0)      // if the year divided by 400 then it's a leep year
                    leep = true;
                else
                    leep = false;
            } else                        // if the year is not a century
                leep = true;
        } else                            // if the year is not divided by 4
            leep = false;

        if(leep)
            System.out.println(year + " is a leep year");
        else
            System.out.println(year + " is not a leep year");
    }
}