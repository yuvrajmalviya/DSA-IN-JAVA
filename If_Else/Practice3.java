package If_Else;

import java.util.Scanner;

public class Practice3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0) System.out.println("divisible by both 5 & 3");
        else if(n%5==0) System.out.println("divisible by 5");
        else if(n%3==0) System.out.println("divisible by 3");
        else{
            System.out.println("not divisible by 5 ");
        }
    }
}
