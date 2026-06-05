package String;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class CountVowelInGivenString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count = 0;
        for(char i = 0; i<word.length(); i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' ||
                    word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U') {
                count++;
            }
        }
        System.out.println(count);
    }
}
