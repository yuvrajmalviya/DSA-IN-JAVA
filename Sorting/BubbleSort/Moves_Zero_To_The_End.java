package Sorting.BubbleSort;

import java.util.ArrayList;
import java.util.List;
public class Moves_Zero_To_The_End {
    static void main(String[] args) {
        int[] nums = {0,2,1,0,3,12,0,5};
        List<Integer> res = new ArrayList<>();

        for(int i =0; i<nums.length; i++){
            if(nums[i]!=0){
                res.add(nums[i]);
            }
        }
        for(int ele : nums){
            if(ele==0) res.add(ele);
        }
        for(int ele: res) System.out.print(ele+" ");
    }
}
