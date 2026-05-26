package BinarySearch;

import java.util.Scanner;

public class First_Occurance_Of_Similiar_Element_In_Sorted_Array {
    public static int FirstOccurance(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mindx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                mindx = mid;
                high = mid - 1;
            } else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;

        }
            return mindx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};

        System.out.println(FirstOccurance(arr, k));
    }
}
