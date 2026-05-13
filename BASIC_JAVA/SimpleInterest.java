package BASIC_JAVA;

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle : ");
        int Principal = sc.nextInt();
        System.out.print("Enter Time : ");
        int Time = sc.nextInt();
        System.out.print("Enter Rate : ");
        int Rate = sc.nextInt();

        double SimpleInterest = (Principal * Time * Rate) /100;
        System.out.println("Simple Interest(S.I) is : "+SimpleInterest);
    }
}
