package String;

import java.util.Scanner;

public class PalindromeString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        boolean res = IsPalindrome(s);
        System.out.println(res);
    }

    public static boolean IsPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }

}
