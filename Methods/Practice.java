package Methods;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice {
    static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, -23, 12, 8, 34, 2};
        int k = 4;
        k = k%arr.length;//reduce the number of step when k greater
        int i = 0, j = arr.length-1;
        rotate(arr,i,j);
        rotate(arr,i,k-1);
        rotate(arr,k,j);
        for(int ele : arr) System.out.print(ele+" ");

    }
    public static void rotate(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}


