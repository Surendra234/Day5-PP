package function;

import java.util.Scanner;

public class Sum_Of_Three_Integer {
    public static void main(String[] args) {

        System.out.println("Enter the integer :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements :");
        for(int i = 0;i < n;i++) {
            System.out.println("a[" + i + "]");
            arr[i] = sc.nextInt();
        }
        int triplets = 0;
        System.out.println("Triplets are :");
        for(int i = 0;i < n-2;i++) {
            for(int j = i+1;j < n-1;j++) {
                for(int k = j+1;k < n;k++) {
                   int sumOfThreeInteger = arr[i] + arr[j] + arr[k];
                   if(sumOfThreeInteger == 0) {
                       triplets = triplets + 1;
                       System.out.println(arr[i] +","+arr[j] +"," +arr[k]);
                   }
                }
            }
        }
        System.out.println("Total triplets :" +triplets);
    }
}