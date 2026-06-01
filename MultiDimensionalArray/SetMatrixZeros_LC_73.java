package MultiDimensionalArray;

public class SetMatrixZeros_LC_73 {
    static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,2,1,2},{1,3,1,5}};
        SetZero(matrix);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static int[][] SetZero(int[][] matrix) {
        int m = matrix.length, n= matrix[0].length;
        boolean firstRowHas0 = false;
        boolean firstColHas0 = false;
        //check first row has zero
        for(int j=0; j<n; j++){
            if(matrix[0][j]==0) firstRowHas0 = true;
        }
        //check if first col has 0
        for(int i = 0; i<m; i++){
            if(matrix[i][0]==0) firstColHas0 = true;
        }
        //set marker (T/F) in first row and first col
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //set matrix as zero
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //convert non-zero in first row with 0
        if(firstRowHas0){
            for(int j=0; j<n; j++){
                matrix[0][j]=0;
            }
        }
        //convert non-zer0 in first col with 0
        if(firstColHas0){
            for(int i=0; i<m; i++){
                matrix[i][0]=0;
            }
        }

        return matrix;
    }
}
