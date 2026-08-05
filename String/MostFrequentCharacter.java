package String;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //BruteForce approach
//        int maxFreq = -1;
//        char ans = s.charAt(0);
//        for(int i=0; i<s.length(); i++){
//            int freq = 1;
//            char ch = s.charAt(i);
//            for(int j=0; j<s.length(); j++){
//                if(s.charAt(j)==ch){
//                    freq++;
//                }
//            }
//            if(freq>maxFreq){
//                maxFreq=freq;
//                ans = ch;
//            }
//            //buz we want to return smallest common frequent character
//            else if(freq==maxFreq && ch<ans){
//                ans = ch;
//            }
//        }
//        System.out.println(ans);

        //Sliding window method
        int maxFreq = 0;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
    }
}
