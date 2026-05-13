package Methods;

public class MaxOfThree {
    public static int max(int a, int b, int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }
    static void main() {
        int x = max(12,1,33);
        System.out.println("Max number is :"+x);
    }
}
