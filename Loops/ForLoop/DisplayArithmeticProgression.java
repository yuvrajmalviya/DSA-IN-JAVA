package Loops.ForLoop;

import java.util.Scanner;

public class DisplayArithmeticProgression {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        //A.P - 2,5,8,11....
        for (int i = 2; i <= 3*n-1; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        //other logic
        int a = 2, d =3;
        for(int i = 1; i<=n; i++){
            System.out.print(a+" ");
            a+=d;
        }

    }
}
