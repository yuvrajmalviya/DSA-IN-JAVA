package If_Else;

import java.util.Scanner;

public class SideOfTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Side : ");
        int b = sc.nextInt();
        System.out.print("Enter third side : ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
}