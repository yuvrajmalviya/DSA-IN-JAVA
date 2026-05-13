package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for(int k= 1;k<=n;k++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();

            for (int j = 1; j <= n; j++){
                System.out.print((char) (i + 66) + " ");
            }
            System.out.println();
        }
    }
}