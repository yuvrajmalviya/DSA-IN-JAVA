package Sorting.SelectionSort;

public class SelectionSortAlgorithm {
    static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,2};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            //Index start from 0 so let assume at -1 index
            int mindex = -1;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = t;
        }
        System.out.print("Sorted Array -->> ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
