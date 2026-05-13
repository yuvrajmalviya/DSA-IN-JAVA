package PatternPrinting;

import java.util.Scanner;

public class Pyramid2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Reverse Pyramid
        int nst = n-1, nsp = 0;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=nst; k++) {
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
