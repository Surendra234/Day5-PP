package function;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {

        int a,b,c;
        double root1,root2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        System.out.println("Enter the value of b :");
        b = sc.nextInt();
        System.out.println("Enter the value of c :");
        c = sc.nextInt();
        double delta = b*b-4*a*c;

        if(delta > 0) {
            root1 = (-b + sqrt(delta))/(2*a);
            root2 = (-b - sqrt(delta))/(2*a);
            System.out.println("root1 = " +root1 + " root2 = " +root2);
        }
        else if(delta == 0) {
            root1 = root2 = -b/(2*a);
            System.out.println("root1 = " +root1 + " root2 = " +root2);
        }
        else {
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-delta)/(2*a);
            System.out.println("root1 = " +(real+imaginary+"i") +" root2 = " +(real-imaginary+"i"));
        }
    }
}