package MultiDimensionalArray;

public class Maximum_In_2DArray {
    static void main(String[] args) {
        int[][] nums = {{4,2,34},{3,2,1},{9,7,6}};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(max<nums[i][j]) max = nums[i][j];
            }
        }
        System.out.println(max);
    }
}
