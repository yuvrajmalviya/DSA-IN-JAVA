package Java_Arrays;

import java.util.Scanner;

public class ProductOfArrayElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product*=arr[i];
        }
        System.out.print("Product is: "+product);

    }
}
