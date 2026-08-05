package Java_Arrays;

public class ShuffleArray_Leetcode_1470 {
    static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] ans = shuffle(nums);
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
    public static  int[] shuffle(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0;
        int i = 0, j = nums.length/2;
        while(i<nums.length/2 && j<nums.length){
            res[k] = nums[i];
            k++;
            res[k] = nums[j];
            i++;
            j++;
            k++;
        }
        return res;
    }
}
