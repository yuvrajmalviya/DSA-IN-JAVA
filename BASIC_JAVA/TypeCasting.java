package BASIC_JAVA;

public class TypeCasting {
    static void main() {
        //TypeCasting = conversion of one data type into another data type
//        char ch = 'A';
//        int x = ch;
//        System.out.println(x);  //implicit typecasting
//
//        char con = 'y';
//        int y = (int)con;  //explicit typecasting
//        System.out.println(y);
//
        char p = '3';
        int z = (int)p;
        System.out.println(z);
//
//        char q = 'c';
//        System.out.println(q+0);  // output 99
//        System.out.println(q+q);  // output 198
//        System.out.println(q*q);  // output 9801

        //integer to character
        int x = 65;
        char ch = (char)x;     //ASCII Value
        System.out.println(ch); //print character which has ASCII value of 65


    }
}
