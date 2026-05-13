package If_Else;

import java.util.Scanner;

public class Practice2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        double num = sc.nextDouble();
//      Take real number input and check if it is an integer or not
//      int x = (int)num;
//      if(num-x==0)
        if (num == (int)num){
            System.out.println("it is an integer");
        }
        else{
            System.out.println("not an integer");
        }
    }
}
