package PatternPrinting;

import java.util.Scanner;

public class AlphabetTriangleHorFlipped {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n+1-i;j++){
//                System.out.print(i+" ");
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
