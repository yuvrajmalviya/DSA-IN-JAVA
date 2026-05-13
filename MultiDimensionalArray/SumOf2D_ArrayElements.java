package MultiDimensionalArray;

import java.util.Scanner;

public class SumOf2D_ArrayElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int raw = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[raw][col];
        for(int i=0;i<raw;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<raw;i++){
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
