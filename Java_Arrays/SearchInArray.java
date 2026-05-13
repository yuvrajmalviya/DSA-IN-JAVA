package Java_Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void Search(int[] ser, int ser_num) {
        boolean flag = false; //consider target is not exists in array
        for(int i=0; i<=ser.length;i++){
            if(ser[i] == ser_num){
                flag=true;
                break;
            }
        }
        if(flag==true) System.out.println("Target Exists in array");
        else System.out.println("target not exists in array");
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ser_num = sc.nextInt();
        int[] arr = {12,2,3,45,3,-913,123};
        Search(arr, ser_num);

    }
}
