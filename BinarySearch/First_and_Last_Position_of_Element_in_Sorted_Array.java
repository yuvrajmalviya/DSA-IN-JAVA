package BinarySearch;

import java.util.Scanner;

public class First_and_Last_Position_of_Element_in_Sorted_Array {
        public static int firstOccurrence(int[] nums, int target) {

            int low = 0;
            int high = nums.length - 1;
            int ans = -1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (nums[mid] == target) {
                    ans = mid;
                    high = mid - 1; // move left
                }
                else if (nums[mid] < target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

            return ans;
        }

        public static int lastOccurrence(int[] nums, int target) {

            int low = 0;
            int high = nums.length - 1;
            int ans = -1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (nums[mid] == target) {
                    ans = mid;
                    low = mid + 1; // move right
                }
                else if (nums[mid] < target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

            return ans;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // User input for array size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            // User input for array elements
            System.out.println("Enter sorted array elements:");

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // User input for target
            System.out.print("Enter target element: ");
            int target = sc.nextInt();

            int first = firstOccurrence(nums, target);
            int last = lastOccurrence(nums, target);

            int[] ans = new int[2];

            ans[0] = first;
            ans[1] = last;

            System.out.println("First Occurrence: " + ans[0]);
            System.out.println("Last Occurrence: " + ans[1]);

            sc.close();
        }
    }
