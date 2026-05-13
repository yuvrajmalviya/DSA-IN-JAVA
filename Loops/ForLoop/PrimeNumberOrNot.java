package Loops.ForLoop;

import java.util.Scanner;

public class PrimeNumberOrNot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
    }
        if(n==1) System.out.println("Not prime");
        else if(flag==false){
            System.out.println("Prime number");
        }
        else{
            System.out.println("not prime");
        }

    }
}
