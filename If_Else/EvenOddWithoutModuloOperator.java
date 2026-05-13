package If_Else;

import java.util.Scanner;

public class EvenOddWithoutModuloOperator {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if((num & 1)== 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
