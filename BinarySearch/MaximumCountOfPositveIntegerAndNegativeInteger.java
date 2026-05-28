package BinarySearch;

public class MaximumCountOfPositveIntegerAndNegativeInteger {
    static void main(String[] args) {
        int[] nums = {-1,-2,-4,-5,0,0,0,1,4,7,9,10};
        int pos = PositiveCount(nums);
        int neg = NegativeCount(nums);
        System.out.println(Math.max(pos,neg));
    }
//    Count for left part (Negative values)
    public static int NegativeCount(int[] nums) {
        int n = nums.length;
        int st = 0, end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid]>=0) end = mid-1;
            else st = mid+1;
        }
        //when st element cross end ele, st will be the count of integer
        return st;
    }
//    count for right part - positive value
    public static int PositiveCount(int[] nums) {
        int n = nums.length;
        int st = 0, end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid]<=0) st = mid+1;
            else end = mid-1;
        }
        //when end element cross st ele, n-st(13-7 = 6) will be the count of integer
        return n-st;
    }
}
