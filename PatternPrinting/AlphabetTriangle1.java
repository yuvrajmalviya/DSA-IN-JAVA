package PatternPrinting;

import java.util.Scanner;

public class AlphabetTriangle1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                //for capital letter
//                System.out.print((char)(j+64)+" ");

                //for small letter
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
