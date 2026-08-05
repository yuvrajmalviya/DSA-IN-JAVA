package Java_Arrays;

public class SquareOfaSortedArray {
    static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] res  = new int[nums.length];

        int left = 0, right = nums.length-1;
        int idx = nums.length-1;

        while(left<=right){
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                res[idx] = nums[left]*nums[left];
                left++;
            }
            else{
                res[idx] = nums[right]*nums[right];
                right--;
            }
            idx--;
        }
        for(int ele: res){
            System.out.print(ele+" ");
        }
    }
}
