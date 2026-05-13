package Loops.WhileLoop;

import java.util.Scanner;

public class ReverseOfaNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int n = sc.nextInt();
        int rev_num = 0;
        int sum = 0;
        while(n!=0){
            rev_num+=(n%10);
            rev_num*=10;
            sum+=n%10; //sum of a number
            n/=10;
        }
        System.out.println("Reverse of number is: "+rev_num);
        System.out.println("Sum of number is: "+sum);
    }
}
