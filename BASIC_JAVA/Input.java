package BASIC_JAVA;

import java.util.Scanner;

public class Input {
    static void main() {
        Scanner sc = new Scanner(System.in);  //take input form user

        //Area of Circle
        System.out.print("Enter radius :");
        double r = sc.nextDouble();
        double a = 3.141592*r*r;
        System.out.println("Area of Circle is : "+a);

        //Square of a number
        System.out.print("Enter value of p :");
        int p = sc.nextInt();
        int square = p*p;
        System.out.println("square is :"+square);

        //Sum of three Numbers
        System.out.print("Enter A : ");
        double A = sc.nextInt();
        System.out.print("Enter B : ");
        double B = sc.nextInt();
        System.out.print("Enter B : ");
        double C = sc.nextInt();

        double sum = A+B+C;
        System.out.println("Sum of A, B & C is : "+sum);
    }
}
