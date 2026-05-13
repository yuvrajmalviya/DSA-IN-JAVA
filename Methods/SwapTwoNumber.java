package Methods;
import java.util.Scanner;

public class SwapTwoNumber {
    public static void Swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x+" "+y);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swap(a,b);

    }
}
