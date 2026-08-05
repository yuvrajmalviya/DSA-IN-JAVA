package Revise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Revision {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {9,9,9};
        int[] ans = AddingOne(nums);
        for(int ele: ans) {
            System.out.print(ele + " ");
        }
    }

    public static int[]  AddingOne(int[] arr) {

        ArrayList<Integer> res = new ArrayList<>();
        int carry = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] + carry < 10){
                res.add(arr[i]+carry);
                carry = 0;
            }
            else{
                res.add(0);
                carry = 1;
            }
        }
        if(carry==1) res.add(1);
        Collections.reverse(res);
        // convert array list into array
        int n = res.size();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }

}
