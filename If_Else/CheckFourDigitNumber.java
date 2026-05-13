package If_Else;

import java.util.Scanner;

public class CheckFourDigitNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        //logical AND(&&)
        if(num>999 && num<10000){
            System.out.println(num+" is four digit number");
        }
        else{
            System.out.println(num +" is not four digit number");
        }
    }
}
