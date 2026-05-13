package PatternPrinting;

import java.util.Scanner;

public class Pyramid1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Method-1 By Maths
//        for(int i=1;i<=n;i++) {
//            for (int j = 1; j <= (n - i+1); j++) {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <= 2*i-1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //Method-2 using variable
        int nst = 1, nsp = n-1;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=nst; k++) {
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
