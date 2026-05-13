package Loops.WhileLoop;

import java.util.Scanner;

public class SumOfDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            sum = sum+n%10;
            n/=10;
        }
        System.out.println(sum+" is sum of "+n+" digit number");

    }
}
