package String;

import java.util.ArrayList;

public class StringBuilders {
    static void main(String[] args) {
//        ArrayList<Character> str = new ArrayList<>();
//        str.add('a');
//        str.add('b');
//        System.out.println(str);

        //Basically StringBuilder is a arraylist of character
        StringBuilder s1 = new StringBuilder();
        // String s1 has 16 character capacity means we append 16 character into s1
        System.out.println(s1.length()+" "+ s1.capacity());

        //capacity of empty StringBuilder is 16, here "Raghav" contain 6 character,
        // so the total capacity of string s2 becomes 16+6 = 22
        String q = "raghav";
        StringBuilder s2= new StringBuilder(q);
        System.out.println(s2.length()+" "+s2.capacity()); // 6 22

        //We also can set capacity
        StringBuilder a = new StringBuilder(10);
        System.out.println(a.length()+" "+a.capacity()); //0 10
        //we can append string, capacilty follow append(capacity increase as we append string)
        a.append("yuvraj");
        System.out.println(a.length()+" "+a.capacity());  //6  10

        StringBuilder s3 = new StringBuilder("recommented");
        //we can set character in string
        s3.setCharAt(8,'d');
        System.out.println(s3);

        //StringBuilder to string
        String con_StrBul_str = s3.toString();
        //we cannot do like this
//        String t = s3;
        System.out.println(con_StrBul_str);
    }
}
