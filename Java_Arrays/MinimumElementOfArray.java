package Java_Arrays;

import java.util.Scanner;

public class MinimumElementOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=min) min=arr[i];
        }
        System.out.print("Min value is: "+min);

    }
}
