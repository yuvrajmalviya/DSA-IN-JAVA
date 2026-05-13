package MultiDimensionalArray;

import java.util.Scanner;

public class SyntaxInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        //take input 2D elements
        for(int i = 0; i<arr.length; i++){ //raw
            for(int j=0; j<arr[0].length;j++){ //column
                arr[i][j] = sc.nextInt();
            }
        }
        //print 2D array's elements
        for(int i = 0; i<arr.length; i++){ //raw
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
     }
}
