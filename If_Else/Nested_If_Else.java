package If_Else;

import java.util.Scanner;

public class Nested_If_Else {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.print("Enter z: ");
        int z = sc.nextInt();

        if(x>y) {
            if (x > z) {
                System.out.println("x is greatest: " + x);
            }
        }
        else if(y>x){
            if(y>z) {
                System.out.println("y is greatest: " + y);
            }
        }
        else if(z>x) {
            if (z>y) {
                System.out.println("z is greatest: " + z);
            }
        }
        else{
            System.out.println("Equal values");
            }
        }
}

