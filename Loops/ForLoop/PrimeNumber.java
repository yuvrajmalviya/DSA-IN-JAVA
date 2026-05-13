package Loops.ForLoop;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i = 2; i<=n-1; i++){
            if(n%i!=0){
                System.out.println("Prime Number");
//                break;
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
}
