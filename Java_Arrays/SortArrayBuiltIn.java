package Java_Arrays;

import java.util.Arrays;

public class SortArrayBuiltIn {

    static void main() {
        int[] arr = {4,1,7,5,-3,10,2};
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr1){
        for(int i = 0; i<=arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
