package String;

import java.util.Locale;

public class BuiltInMethods {
    static void main(String[] args) {
        String s = "Jack Michel";
        String b = "John";
        //s.indexOf() - it return then first occurrence of word
        System.out.println(s.indexOf("c"));   //2

//        s.lastIndexOf() - print the last occurrence of word
        System.out.println(s.lastIndexOf("c"));  //7
        System.out.println(s.lastIndexOf("y"));  //-1

//        s.toLowerCase() - print string in lower case
        System.out.println(s.toLowerCase());

//        s.toUpperCase() - print string in upper case
        System.out.println(s.toUpperCase());

//        s.contains() - it print true or false if continous string part is present in Original String
        System.out.println(s.contains("chel"));

//        s.startsWith() - true/false
        System.out.println(s.startsWith("Jac"));

//        s.endsWith() - true/false
        System.out.println(s.endsWith("chel"));

//        s.concat(b) -  concatination of two string
        s = s.concat(b);
        System.out.println(s);
    }
}