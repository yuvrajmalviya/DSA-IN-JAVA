package Sorting.BubbleSort;

public class ArrayInDesendingOrder {
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

        for(int i=0; i<nums.length-1; i++){
            int swaps=0;
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        Print(nums);
    }
}
