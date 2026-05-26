package BinarySearch;
import java.util.Scanner;

public class BinarySearchAlgorithm {
        public static boolean binarySearch(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(nums[mid] == target) {
                    return true;
                }
                else if(nums[mid] < target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            boolean result = binarySearch(nums, target);
            System.out.println(result);
        }
    }
