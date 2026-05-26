package Sorting;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {
        public static ArrayList<Integer> findUnion(int a[], int b[]) {

            ArrayList<Integer> res = new ArrayList<>();

            int i = 0, j = 0;

            while (i < a.length && j < b.length) {

                // Skip duplicates in a
                if (i > 0 && a[i] == a[i - 1]) {
                    i++;
                    continue;
                }

                // Skip duplicates in b
                if (j > 0 && b[j] == b[j - 1]) {
                    j++;
                    continue;
                }

                if (a[i] < b[j]) {
                    res.add(a[i]);
                    i++;
                }
                else if (a[i] > b[j]) {
                    res.add(b[j]);
                    j++;
                }
                else {
                    res.add(a[i]);
                    i++;
                    j++;
                }
            }

            // Remaining elements of a
            while (i < a.length) {

                if (i > 0 && a[i] == a[i - 1]) {
                    i++;
                    continue;
                }

                res.add(a[i]);
                i++;
            }

            // Remaining elements of b
            while (j < b.length) {

                if (j > 0 && b[j] == b[j - 1]) {
                    j++;
                    continue;
                }

                res.add(b[j]);
                j++;
            }

            return res;
        }

        public static void main(String[] args) {

            int a[] = {2, 2, 3, 4, 5};
            int b[] = {1, 1, 2, 3, 4};

            ArrayList<Integer> ans = findUnion(a, b);

            System.out.println(ans);
        }
    }

