package BinarySearch;

public class SingleElementInSortedArray {
    static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,88,88};
        int res = SingleElement(nums);
        System.out.println(res);
    }
    public static int SingleElement(int[] nums){
        int n = nums.length;
        int low = 0, high = n-1;
        //nums = [1] only single element in array
        if(n==1) return nums[0];
        while(low<=high){
            int mid = low + (high-low)/2;
            //when single value is in first position of array
            if(mid==0 && nums[0]==nums[1]) return nums[0];
            //when single value is in last position of array
            if(mid==n-1 && nums[n-1]==nums[n-2]) return nums[n-2];
            //when mid!=previousElement && mid!=nextElement
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            //when mid is even both side search space has equal size
            if(mid%2==0){
                //if mid == mid-1 the go left because same element will pair up
                if(nums[mid]==nums[mid-1]) high = mid-1;
                // otherwise go right
                else low = mid+1;
            }
            //mid is in odd index
            else{
                //Go right because at left only three element are in which one element(mid-1)will pair up with mid
                // and rest two definitely same element because two single value is not allowed
                if(nums[mid]==nums[mid-1]) low = mid+1;
                //if not equal then move left
                else high = mid-1;
            }
        }
        return -1;
    }
}
