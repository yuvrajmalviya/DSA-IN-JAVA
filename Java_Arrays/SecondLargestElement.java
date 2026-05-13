package Java_Arrays;

public class SecondLargestElement {
    static void main(String[] args) {
        int[] arr = {4,10,10,6,3,8};
        int max = Integer.MIN_VALUE;
        int sec_lar=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>sec_lar && arr[j]!=max){
                sec_lar=arr[j];
            }
        }
        System.out.println(sec_lar);
    }

}
