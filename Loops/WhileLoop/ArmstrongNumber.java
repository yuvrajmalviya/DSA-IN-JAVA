package Loops.WhileLoop;

public class ArmstrongNumber {
    static void main(String[] args) {
        int num = 12;
        int n=num;
        int count = 0;
        while(n>0){
            int digit = n%10;
            n/=10;
            count++;
        }
        n = num;
        int res = 0;
        while(n>0){
            int digit = n%10;
            res = res+(int)Math.pow(n,count);
            n/=10;
        }
        if(res==num) System.out.println("Yes, it is ArmstrongNumber");
        else System.out.println("No it is not");
    }
}
