package PatternPrinting;

import java.util.Scanner;

public class Diamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1, nsp = n-1;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nst = 2*n-3;
        nsp = 1;
        for(int i=1;i<=n-1;i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
