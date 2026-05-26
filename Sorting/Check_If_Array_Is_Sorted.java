package Sorting;

public class Check_If_Array_Is_Sorted {
    static void main(String[] args) {
        int[] nums = {1, 1, 4, 8, 9, 15};
        int[] arr = {1, 0, 4, 3, 93, 1235};

        System.out.println(check(nums));
    }

    public static boolean check(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

}