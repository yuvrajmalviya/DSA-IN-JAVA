package Loops;

import java.util.Scanner;

public class BreakStatement {
    static void main() {
        //check composite number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i = 2;i<=n-1;i++){
            if(n%i==0){   //1 to n ka ek factor
                System.out.println("composite number");
                break;
            }
            else{
                System.out.println("Not composite");
            }
        }
    }
}
