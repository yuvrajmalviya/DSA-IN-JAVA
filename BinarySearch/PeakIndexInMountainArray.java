package BinarySearch;

public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {

        int low = 1;
        int high = arr.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Peak element found
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Increasing slope
            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            // Decreasing slope
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 7, 6, 3, 1};

        int ans = peakIndexInMountainArray(arr);
        System.out.println("Peak Index = " + ans);
        System.out.println("Peak Element = " + arr[ans]);
    }
}
