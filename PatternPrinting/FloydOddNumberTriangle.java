package PatternPrinting;

import java.util.Scanner;

public class FloydOddNumberTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int a = 1;
            for(int j = 1; j<=i; j++){
                System.out.print(a+" ");
                a+=2;
//                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }
    }
}
