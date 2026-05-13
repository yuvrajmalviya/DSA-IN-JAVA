package MultiDimensionalArray;

public class PrintColumnWise {
    static void main(String[] args) {
        int[][] nums = {{4,2,34},{3,2,1},{9,7,6}};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((i+j)%2==0){
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
                }
            }
        }
    }
}
