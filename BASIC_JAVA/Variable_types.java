package BASIC_JAVA;

public class Variable_types {
    static void main() {
        System.out.println("introduction of variables");

        //integer type
        int x = 5;
        System.out.println(x);
        System.out.println(x+7);
        int y;    //declaration
        y = 20;   //initialization
        System.out.println(y);
        System.out.println((x+y)+" is sum of x+y");
        y = 30;
        System.out.println(y);
        y = y-12;
        System.out.println(y);
        y = y/3;
        System.out.println(y);

        //long
        long num1 = 1234624342;
        long A =  Long.MAX_VALUE;   //size of long
        System.out.println(A);

        //double
        double a = 12.34;
        double b = 349.34;
        System.out.println(a);
        System.out.println(b);

        //char = only store single value(Case-Sensitive)
        char name = 's';
        System.out.println(name);
        char amir = 'e';
        System.out.println(amir);
        char plus = '+';
        System.out.println(plus);

        //boolean (true and false) typecasting is not possible
        boolean flag = true;
        boolean flag1 = false;
        System.out.println(flag+" "+flag1);
    }
}
