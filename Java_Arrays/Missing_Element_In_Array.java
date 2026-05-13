package Java_Arrays;

import java.util.Scanner;

public class Missing_Element_In_Array {
    static void missing(int[] nums) {
        int array_sum = 0;
        int n = nums.length+1;
        int total_sum = n*(n+1)/2;
        for(int ele : nums){
            array_sum+=ele;
        }
        System.out.println(total_sum-array_sum);

    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size-1; i++){
            arr[i] = sc.nextInt();
        }
        missing(arr);
    }
}
