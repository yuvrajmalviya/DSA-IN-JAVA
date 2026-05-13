package Loops.ForLoop;

import java.util.Scanner;

public class Print_n_times {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            System.out.print("* ");
        }
    }
}
