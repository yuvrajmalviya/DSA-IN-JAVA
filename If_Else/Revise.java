package If_Else;

import java.util.Scanner;

public class Revise {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();
        if(marks >= 90 && marks<=100) System.out.println("A");
        else if(marks>=75 && marks<=89) System.out.println("B");
        else if(marks>=60 && marks<=74) System.out.println("C");
        else System.out.println("D");

    }
}
