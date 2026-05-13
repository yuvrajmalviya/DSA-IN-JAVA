package If_Else;

import java.util.Scanner;

public class DivisibleBy5or3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //Logical OR(||)
        if(num%5==0 || num%3==0){
            System.out.println("Yes number is divisible by 5 or 3");
        }
        else{
            System.out.println("not divisible by 5 or 3");
        }
    }
}
