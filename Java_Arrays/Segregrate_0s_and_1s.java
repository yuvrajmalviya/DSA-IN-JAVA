package Java_Arrays;

public class Segregrate_0s_and_1s {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 0};
//        int NumOfZero = 0;
//        int NumOfOne = 0;
        SegregrateN(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

        public static void SegregrateN(int nums[]){
            int NumOfZero = 0;
            for (int ele : nums) {
                if (ele == 0) {
                    NumOfZero++;
                }
            }
            for (int i = 0; i < NumOfZero; i++) {
                nums[i] = 0;
            }
            for (int i = NumOfZero; i < nums.length; i++) {
                nums[i] = 1;
            }
        }
    }
