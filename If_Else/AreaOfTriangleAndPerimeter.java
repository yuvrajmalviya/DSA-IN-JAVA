package If_Else;

import java.util.Scanner;

public class AreaOfTriangleAndPerimeter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter breadth of triangle: ");
        int wid = sc.nextInt();
        int Area = len*wid;
        int perimeter = 2*(len+wid);
        if(Area>perimeter){
            System.out.println("Area is greater than to its perimeter: "+Area+">"+perimeter);
        }
        else{
            System.out.println("Area is less than perimeter");
        }

    }
}
