package Loops.ForLoop;

import java.util.Scanner;

public class PrintEvenNumber {
    static void main() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scn.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

}
