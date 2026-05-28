package BinarySearch;

import java.util.Scanner;

public class SearchInRotatedSortedArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = {4,5,6,7,0,1,2};
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int res = SearchElementInRotatedArray(nums, target);
        System.out.println("Target is at index : "+res);

    }
    public static int SearchElementInRotatedArray(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return mid;
            //First check which part is rotated(pivot)
            //if first value of array is less equal to mid the left part is rotated
            if(nums[0]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid]) high = mid-1;
                else low = mid+1;
            }
            //else - mid-element < then last element of array
            else{
                //move right if target is greater than mid and less then last element
                if(target>nums[mid] && target <=nums[high]) low = mid+1;
                else high = mid-1;
            }

        }
        return -1;
    }
}
