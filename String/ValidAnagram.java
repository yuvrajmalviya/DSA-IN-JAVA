package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Boolean check = Anagram(str1, str2);
        System.out.println(check);
    }

    public static Boolean Anagram(String str1, String str2) {
        char[] str1_arr = str1.toCharArray();
        char[] str2_arr = str2.toCharArray();
        if(str1.length()!=str2.length()) return false;
        Arrays.sort(str1_arr);
        Arrays.sort(str2_arr);
        for(int i=0; i<str1.length(); i++){
            if(str1_arr[i] != str2_arr[i]) return false;
        }

        return true;

    }
}
