package Sorting;

import java.util.Arrays;

public class MergeSortedArray {

        public static void merge(int[] nums1, int m, int[] nums2, int n) {

            int[] mergeArray = new int[m + n];

            int i = 0, j = 0, k = 0;

            // merge both arrays
            while (i < m && j < n) {

                if (nums1[i] < nums2[j]) {
                    mergeArray[k++] = nums1[i++];
                } else {
                    mergeArray[k++] = nums2[j++];
                }
            }

            // remaining elements of nums1
            while (i < m) {
                mergeArray[k++] = nums1[i++];
            }

            // remaining elements of nums2
            while (j < n) {
                mergeArray[k++] = nums2[j++];
            }

            // copy back into nums1
            for (int x = 0; x < m + n; x++) {
                nums1[x] = mergeArray[x];
            }
        }

        public static void main(String[] args) {

            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int m = 3;

            int[] nums2 = {2, 5, 6};
            int n = 3;

            merge(nums1, m, nums2, n);

            System.out.println(Arrays.toString(nums1));
        }
    }

