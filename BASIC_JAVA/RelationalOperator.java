package BASIC_JAVA;

import java.util.Scanner;

public class RelationalOperator {
    static void main() {
    //It is used to compare two quantities (>,<,>=,<=,!=,==)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println((a<=b));
        System.out.println(a!=b);
        System.out.println(a==b);


    }

}
