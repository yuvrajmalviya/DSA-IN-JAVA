package Java_Arrays;

import java.util.Arrays;

public class TwoSumTarget {
    public static int[] TwoSum (int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
//                    System.out.print(i+" "+j);
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = TwoSum(nums,target);
        System.out.println(Arrays.toString(res));

    }
}
