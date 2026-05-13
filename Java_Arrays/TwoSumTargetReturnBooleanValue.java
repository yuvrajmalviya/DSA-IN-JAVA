package Java_Arrays;

public class TwoSumTargetReturnBooleanValue {
    public static boolean boolreturn(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){  //start with i+1 buz if we check for one index for example we have to check
//                                                other indices. we may not add same element twice
                if(arr[i]+arr[j]==target){
                    return true;    //if sum of any two indices is equal to target then return true
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        boolean result = boolreturn(nums,target);
        System.out.println(result);

    }
}

