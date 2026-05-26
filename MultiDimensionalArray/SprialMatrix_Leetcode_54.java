import java.util.ArrayList;
import java.util.List;

public static class SprialMatrix_Leetcode_54 {
        public List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> res = new ArrayList<>();

            int m = matrix.length;
            int n = matrix[0].length;

            int FirstRow = 0;
            int LastRow = m - 1;
            int FirstCol = 0;
            int LastCol = n - 1;

            while (FirstRow <= LastRow && FirstCol <= LastCol) {

                // Top Row
                for (int j = FirstCol; j <= LastCol; j++) {
                    res.add(matrix[FirstRow][j]);
                }
                FirstRow++;

                if (FirstRow > LastRow || FirstCol > LastCol)
                    break;

                // Right Column
                for (int i = FirstRow; i <= LastRow; i++) {
                    res.add(matrix[i][LastCol]);
                }
                LastCol--;

                if (FirstRow > LastRow || FirstCol > LastCol)
                    break;

                // Bottom Row
                for (int j = LastCol; j >= FirstCol; j--) {
                    res.add(matrix[LastRow][j]);
                }
                LastRow--;

                if (FirstRow > LastRow || FirstCol > LastCol)
                    break;

                // Left Column
                for (int i = LastRow; i >= FirstRow; i--) {
                    res.add(matrix[i][FirstCol]);
                }
                FirstCol++;
            }

            return res;
        }
    }

        public static void main(String[] args) {

            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13,14,15,16}
            };

            SprialMatrix_Leetcode_54 obj = new SprialMatrix_Leetcode_54();

            List<Integer> ans = obj.spiralOrder(matrix);

            System.out.println(ans);

    }

