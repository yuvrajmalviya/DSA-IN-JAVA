package MultiDimensionalArray;

import java.util.Scanner;

public class Multiplication_of_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First Matrix
        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        // Second Matrix
        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];

        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        // Matrix multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }
        // Result matrix
        int[][] C = new int[r1][c2];

        // Matrix Multiplication
        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < c1; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print Result
        System.out.println("Result Matrix:");

        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {

                System.out.print(C[i][j] + " ");
            }

            System.out.println();
        }
    }
}