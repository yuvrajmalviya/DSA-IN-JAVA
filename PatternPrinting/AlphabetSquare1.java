package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
    }
}