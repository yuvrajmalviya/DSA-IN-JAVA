package BASIC_JAVA;

public class LogicalOperator {
    static void main() {
        int x =10;
        int y = 20;
        boolean z = true;

        System.out.println("x && y: " + (x<y && y>x));
        System.out.println("x || y: " + (x<y || y<x));
        System.out.println("!x: " + !z);
    }
}
