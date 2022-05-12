package function;

import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {

        int[][] matrix;
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();
        System.out.println("Enter the number of cols :");
        col = sc.nextInt();

        matrix = new int[row][col];
        for(int i = 0;i < row; i++) {
            for(int j = 0;j < col;j++) {
                System.out.print("Enter the numbers of row : " +i + " column : " +j +":");
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < row;i++) {
            for(int j = 0;j < col;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}