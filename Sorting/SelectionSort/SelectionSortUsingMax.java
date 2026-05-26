package Sorting.SelectionSort;

public class SelectionSortUsingMax {
    static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,2};
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for(int j=i; j>=0; j--){
                if(arr[j]>max) {
                    max = arr[j];
                    maxdx= j;
                }
            }
            int t = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = t;
        }

        System.out.print("Sorted Array -->> ");
        for(int ele : arr){
            System.out.print(ele+" ");
    }
}
}
