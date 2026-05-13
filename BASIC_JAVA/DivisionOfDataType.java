package BASIC_JAVA;

public class DivisionOfDataType {
    static void main() {
        // int/int = int
        double x = 5/2;  // output = 2.0  the answer of 5/2 is 2 because both are integer value but 2 is assigned as decimal value because
                         // x stored only double type value as per double datatype.
        System.out.println(x);

        // double/double = double
        double y = 5.0/2.0; // output = 2.5
        System.out.println(y);

        // double/int = double
        double z = 5.0/2; // output = 2.5
        System.out.println(z);

        // int/double = double
        double p = 5/2.0; // output = 2.5
        System.out.println(p);
    }
}
