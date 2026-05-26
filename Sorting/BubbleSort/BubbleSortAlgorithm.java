package Sorting.BubbleSort;

public class BubbleSortAlgorithm {
    public static void Print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    static void main(String[] args) {
        int[] nums = {5,2,-3,9,0,12,1};
        System.out.println("Before Sorted : ");
        Print(nums);
        System.out.println();
        System.out.println("After Sorted : ");
//        int n = nums.length;
        for(int i = 0; i<nums.length-1; i++){
            //for(int j = 0 ; j<m-1; j++)
//            for(int j = 0; j<nums.length-1-i; j++){
//                if(nums[j]>nums[j+1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
            //m--;

            //Bubble Sort Optimised Code-
            int swaps = 0;
//            boolean swaps = true;
            for(int j = 0; j<nums.length-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaps++;
//                    swaps = false;
                }
            }
            if(swaps==0) break;
//            if(swaps==true) break;
        }
        Print(nums);
    }
}
