package Loops.WhileLoop;

import java.util.Scanner;

public class FibonacciSeries {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term : ");
        int n = sc.nextInt();

        int a = 0;              //1
        int b = 1;              //1
        int count = 2;
        while(count<=n){        //2<=7
            int temp = b;       //temp = 1
            b+=a;               //b = 0+1 = 1
            a = temp;           //a = 1
            count++;
        }
        System.out.println(n+"th term of fibonacci series is : "+b);
    }
}
