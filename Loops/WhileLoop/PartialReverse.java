package Loops.WhileLoop;

public class PartialReverse {
    static void main(String[] args) {
                int n=123456;
                int size=3;
                int org_size=size;//3
                int rev=0; // 6 || 65 || 654
                while(size>0)//3>0 || 2>0 || 1>0 || 0>0
                {
                    int dig=n%10;   // 123456%10=6  || 12345%10=5   || 1234%10=4
                    rev=rev*10+dig; //0*10+3=6   || 6*10+5=65 || 65*10+4=654
                    n=n/10;        // 123456/10=12345  || 12345/10=1234  || 1234/10=123
                    size--;

                }
                int result=n*(int)Math.pow(10,org_size)+rev; //123*1000+654=123654
                System.out.println(result);
            }
        }



