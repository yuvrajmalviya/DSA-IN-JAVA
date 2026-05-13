package BASIC_JAVA;

public class ModulusOperator {
    static void main() {
        int a = 6, b = 4, c =a%b;
        System.out.println("a % b is : "+c);

        // a % b = a (if a < b)
        System.out.println(5%37);
        // a % (-b) = a % b
        System.out.println(5%(-2));
        // (-a) % b = -(a % b)
        System.out.println((-39)%(-10));


    }
}
