package Java_Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void Rotate_array(int arr[], int i, int j){
        //It swap the element until i is less than j and i is incremented and j is decremented by 1 till i<j
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print("Enter from where array will rotated(k is not more than array length): ");
        int k = sc.nextInt();
        k%=arr.length;
        System.out.print("Array Before Rotation: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        //It reverses complete array i start from 0 and j start from array length -1
        Rotate_array(arr,0,arr.length-1);
        //Now we have to rotate our array for that we need to swap the array into two parts
        //1. we swaped our array from i = 0 to k-1 means i start form beginning to where our array has rotated - 1
        // i = 0 and k-1 (0 to suppose k = 3 means k-1 = 2)
        Rotate_array(arr,0,k-1);
        // i start from k means from where array will rotate to last element of array
        Rotate_array(arr,k,arr.length-1);
        System.out.println();

        System.out.print("Array After Rotation: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    }


