package Java_Arrays;

public class PassingArrayMethods {
    public static void change(int[] y) { //int[] n is reference
        y[2] = 99;
    }
    static void main() {
        int[] x = {10,20,30,40};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
}
