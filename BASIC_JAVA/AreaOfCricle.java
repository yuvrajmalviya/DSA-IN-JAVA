package BASIC_JAVA;

import static java.lang.Math.pow;

public class AreaOfCricle {
    static void main() {
        double r = 3.8;
        //pow is used to print power
        double area = 3.14*pow(r,2);
//        double area = 3.14*r*r;
        System.out.print("Area of circle is : ");
        System.out.print(area);
    }
}
