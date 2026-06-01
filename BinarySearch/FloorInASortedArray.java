package BinarySearch;

public class FloorInASortedArray {
    static void main(String[] args) {
        int[] nums = {1,2,4,10,10,12,19};
        int x = 11;
        int n = nums.length;
        int st = 0, end=n-1;
        int res = 0;
        while (st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]>x) end=mid-1;
            else{
                res = mid;
                st = mid+1;
            }
        }
        System.out.println(res);
    }
}
