package Java_Arrays;

public class ReverseArray {
    public static int[] reverse(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    static void main(String[] args) {
        int[] arr = {5,8,2,6,9};
        int[] rev = reverse(arr);
        for(int ele : rev){
            System.out.print(ele+" ");
        }
    }
}
