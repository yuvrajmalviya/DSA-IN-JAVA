package MultiDimensionalArray;

public class RawWithMaximumSum {
    static void main(String[] args) {
        int[][] nums = {{4,2,34},{3,2,1},{9,7,6}};
        int MaxSum = Integer.MIN_VALUE;
        //to find raw no
        int raw = -1; //buz raw start from 0
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
//            MaxSum = Math.max(MaxSum,sum);
            if(sum>MaxSum){
                MaxSum=sum;
                raw = i;

            }
        }
        System.out.println("Maximum sum of array raw at "+raw+" is "+MaxSum);
    }
}
