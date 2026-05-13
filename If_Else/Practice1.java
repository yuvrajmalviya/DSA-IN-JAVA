package If_Else;

import java.util.Scanner;

public class Practice1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if (num > 0){
            if (num % 5==0){
                System.out.println("Number is divisible by 5");
            }
        else{
                System.out.println("Number is not divisible by 5");
            }
        }

    }
}
