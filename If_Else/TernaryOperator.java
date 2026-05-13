package If_Else;

import java.util.Scanner;

public class TernaryOperator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        //Ternary Operator
        //condition ? true value(inside if sout) : false value(inside else sout)
        System.out.println((n+" is "+((n%2==0)?"Even":"odd")));

        // if n>=0 than 100 is assign to value, else 0
        int value = n>=0 ? 100 : 0;
        System.out.println(value);
    }
}
