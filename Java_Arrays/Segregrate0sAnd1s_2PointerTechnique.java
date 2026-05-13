package Java_Arrays;

public class Segregrate0sAnd1s_2PointerTechnique {
    static void ZerosOnes(int[] arr) {
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j] == 1) j--;
            else if((arr[i] == 1) && (arr[j]==0)){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
    static void main(String[] args) {
        int [] arr = {1,0,0,1,1,1,1,0,1,0,1,0,1,0};
        ZerosOnes(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
