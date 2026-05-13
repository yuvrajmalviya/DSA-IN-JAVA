package If_Else;

import java.util.Scanner;

public class Find_Quadrant_Of_X_and_Y {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x-axis: ");
        int x = sc.nextInt();
        System.out.print("Enter y-axis: ");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("Origin"); //(0,0)
        }
        else if(x>0 && y>0){
            System.out.println("1st Quadrant"); // ++
        }
        else if (x<0 && y>0) {
            System.out.println("2nd Quadrant"); //-+
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quadrant"); // --
        }
        else if(x>0 && y<0){
            System.out.println("4th Quadrant"); //+-
        }
    }
}
