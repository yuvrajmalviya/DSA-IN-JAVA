package PatternPrinting;

import java.util.Scanner;

public class HollowRectangle {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        int raw = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1; i<=raw; i++){
            for(int j = 1; j<=col; j++) {
                if (i == 1 || i == raw || j == 1 || j == col)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
                System.out.println();

        }
    }
}
