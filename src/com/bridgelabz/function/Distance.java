package function;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        int x1 = 0;
        int y1 = 0;
        int x2,y2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x2 :");
        x2 = sc.nextInt();
        System.out.println("Enter the value of y2 :");
        y2 = sc.nextInt();

        float result = (float) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("Distance = " +result);
    }
}
