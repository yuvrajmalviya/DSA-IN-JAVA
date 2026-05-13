package Java_Arrays;

public class ThirdMaxElement {
        public int thirdMax(int[] nums) {
            long max=Long.MIN_VALUE;
            long secMax=Long.MIN_VALUE;
            long thirdMax=Long.MIN_VALUE;

            for(int x:nums){
                if(x>max){
                    thirdMax=secMax;
                    secMax=max;
                    max=x;
                }else if(x>secMax && x!= max){
                    thirdMax=secMax;
                    secMax=x;
                }else if(x>thirdMax && x!= max && x!= secMax){
                    thirdMax=x;
                }
            }
            if(thirdMax!= Long.MIN_VALUE){
                return (int) thirdMax;
            }else{
                return (int)max;
            }
        }

    static void main(String[] args) {

    }
    }

