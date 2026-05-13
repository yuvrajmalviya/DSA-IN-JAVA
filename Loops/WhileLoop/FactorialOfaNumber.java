package Loops.WhileLoop;

import java.util.Scanner;

public class FactorialOfaNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
