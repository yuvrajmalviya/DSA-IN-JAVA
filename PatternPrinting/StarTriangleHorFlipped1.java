package PatternPrinting;

import java.util.Scanner;

public class StarTriangleHorFlipped1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n+1-i;j++){
//                System.out.print(i+" ");
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
