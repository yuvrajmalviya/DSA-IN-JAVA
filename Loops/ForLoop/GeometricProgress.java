package Loops.ForLoop;

import java.util.Scanner;

public class GeometricProgress {
    static void main() {
        Scanner sc = new Scanner(System.in);
         //display this g.p. 1,2,4,8..... upto 'n'
        System.out.print("Enter term: ");
        int n = sc.nextInt();
        int a=1,r=2;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a *= r;
        }
    }
}
