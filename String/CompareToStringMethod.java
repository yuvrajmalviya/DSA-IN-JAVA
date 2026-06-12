package String;

import java.util.Locale;

public class CompareToStringMethod {
    static void main(String[] args) {
        String a = "Yuvraj";
        String b = "rahul";
        System.out.println(a.startsWith(a.toUpperCase()));
        System.out.println();
        //It compare the ASCII value of character and return
        System.out.println(a.compareTo(b));
    }
}
