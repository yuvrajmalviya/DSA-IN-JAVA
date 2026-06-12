package String;

import java.util.Scanner;

public class CountDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //integer to String
        int n = sc.nextInt();
        String s = "" + n;
        //count
        System.out.println(s.length());

        //double to string
        double num = sc.nextDouble();
        String s2 = "" + num;
        System.out.println(s2);
        System.out.println(s2.length());

    }
}
