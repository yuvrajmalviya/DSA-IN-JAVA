package If_Else;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class absoluteValue {
    static void main() {
        //absolute value : means convert negative value to positive or if value is already positive then return as it is
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("absolute value is : "+num);
        }
        else if(num<0){
            System.out.println("absolute value is : "+ -num);
        }
        else{
            System.out.println("Invalid number");
        }

//        if(num<0) {
//            num = -num;
//            System.out.println(num);
//        }
    }
}
