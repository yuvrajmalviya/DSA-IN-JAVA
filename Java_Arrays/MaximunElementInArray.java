package Java_Arrays;

import java.util.Scanner;

public class MaximunElementInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.print("Max value is: "+max);

    }
}
