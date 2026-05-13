package PatternPrinting;

import java.util.Scanner;

public class NumberSquare1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
