package Java_Arrays;

import java.util.Scanner;

public class OutputInput {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {-5,8,2,67,43,-97};
//        for(int i = 0; i<=5; i++){
//            System.out.print(arr[i]+" ");
        //length
//            System.out.print(arr.length);

//        System.out.println();
//        int i=0;
//        while(i<6){
//            System.out.print(arr[i]+" ");
//            i++;
//        }
        int[] num = new int[7];
//        for(int i=0; i<7;i++){
//            System.out.print(num[i]+" ");//by default values are zero
//        }
        //input
        for (int i = 0; i < 7; i++) {
            num[i] = sc.nextInt();
        }
        //output
        for(int i =0;i<7;i++){
            System.out.print(2*num[i]+" ");
        }
    }
}
