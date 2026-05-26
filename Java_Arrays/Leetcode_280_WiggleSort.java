package Java_Arrays;

import java.util.Scanner;

public class Leetcode_280_WiggleSort {
    static void main(String[] args){
        int[] nums = {3, 5, 2, 1, 6, 4};
        for(int i = 1; i<nums.length;i++){
            if((i%2==1 && nums[i]<nums[i-1]) || (i%2==0) && nums[i]>nums[i-1]){
                swap(nums,i,i-1);
            }
        }
        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[i-1];
        nums[i-1] = temp;

    }
}
