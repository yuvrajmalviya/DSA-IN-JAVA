package If_Else;

import java.util.Scanner;

public class OddEven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        long a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
            System.out.println("Correct");
        }
        else {
            System.out.println("Odd");
            System.out.println("Correct");
        }

    }
}
