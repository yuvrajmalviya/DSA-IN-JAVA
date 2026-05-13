package MultiDimensionalArray;

public class RawWithMinimumSum {
    static void main(String[] args) {
        int[][] nums = {{4,2,34},{3,2,1},{9,7,6}};
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<nums[i].length;j++){
                sum+=nums[i][j];
            }
            if(sum<minSum){
                minSum = sum;
            }
        }
        System.out.println(minSum);
    }
}
