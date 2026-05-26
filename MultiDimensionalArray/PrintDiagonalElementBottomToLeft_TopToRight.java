package MultiDimensionalArray;

public class PrintDiagonalElementBottomToLeft_TopToRight {
    public static void main(String[] args) {

        char[][] matrix = {{'a', 'b', 'c', 'd', 'e'},
                           {'f', 'g', 'h', 'i', 'j'},
                           {'k', 'l', 'm', 'n', 'o'},
                           {'p', 'q', 'r', 's', 't'}};
        int m = matrix.length;
        int n = matrix[0].length;
        // First half diagonals
        for (int k = 0; k < m; k++) {
            int i = k;
            int j = 0;
            while (i >= 0 && j < n) {
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }
        // Second half diagonals
        for (int k = 1; k < n; k++) {
            int i = m - 1;
            int j = k;
            while (i >= 0 && j < n) {
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
                }
            }
        }

