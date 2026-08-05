package Java_Arrays;

public class CountSmallerNumberThanCurrentNumber_Leetcode_1365 {

    static void main(String[] args) {

        int[] nums = {8,1,6,5,3};
        int[] res = new int[nums.length];
        //Brute force

        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]<nums[i]) count++;
            }
            res[i] = count;
        }

        for(int ele: res){
            System.out.print(ele +" ");
        }
    }
}
