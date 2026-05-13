package Loops.ForLoop;

import java.util.Scanner;

public class AvergageWIthO1Complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number between 1 to 15: ");
        int n = sc.nextInt();
        int avg = (1 + n) / 2;
        System.out.println(avg);

    }
}
