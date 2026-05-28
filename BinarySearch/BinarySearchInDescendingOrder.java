package BinarySearch;

import java.util.Arrays;

public class BinarySearchInDescendingOrder {
    static void main(String[] args) {
        int[] arr = {10,8,8,7,7,5,3,2,1,1,0};
        int target = 0;
        int low = 0, high = arr.length-1;
        int mindx = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                mindx = mid;
                break;
            }
            else if(arr[mid]>target){
                low = mid+1;
            }
            else high = mid-1;
        }
        System.out.println(mindx);
    }
}
