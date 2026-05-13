package Loops.WhileLoop;

import java.util.Scanner;

public class CountDigitsOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n==0) n=1;
        int count = 0;
        while(n!=0){
            int digit = n%10;
            n/=10;
            count++;
        }
        System.out.println(count+" digit number");

//        for(int i=0; i<=n;i++){
//            n/=10;
//            count++;
//        }
//        System.out.println(count);
    }
}
