package BinarySearch;

public class SearchInsertPosition {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int target = 6;
        int st = 0, end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("taget will be lie on index : "+st);
    }
}
