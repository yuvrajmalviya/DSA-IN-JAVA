package MultiDimensionalArray;

public class MatrixInSnakePattern {
    static void main(String[] args) {
        int[][] nums = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                for(int j = 0; j<nums[0].length; j++){
                    System.out.print(nums[i][j]+" ");
                }
            }
            else{
                for(int j = nums[0].length-1; j>=0; j--) {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
