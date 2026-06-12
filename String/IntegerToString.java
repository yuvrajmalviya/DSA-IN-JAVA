package String;

import java.util.Scanner;

public class IntegerToString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = ""; //empty string
        s +=n;
        System.out.println(s);

        //one more method
        String s2 = Integer.toString(n);
        System.out.println(s2);

    }
}
