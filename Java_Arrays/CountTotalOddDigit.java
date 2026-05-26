package Java_Arrays;

public class CountTotalOddDigit {
    static void main(String[] args) {
        int[] num = {12,3,23,54,67,9034};
        int count = 0;
        for(int i = 0; i<num.length;i++){
            while(num[i]>0){
                int digit = num[i]%10;
                if(digit%2!=0) count++;
                num[i]/=10;
            }
        }
        System.out.println(count);
    }

}
