package If_Else;

import java.util.Scanner;

public class Magnitude {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if(num<69){
            System.out.println("Magnitude of "+num+" is "+ -num+"\nIt is smaller than 69");
        }
        else{
            System.out.println("Magnitude of "+num+" is "+ -num+" It is not smaller than 69");
        }
    }
}
