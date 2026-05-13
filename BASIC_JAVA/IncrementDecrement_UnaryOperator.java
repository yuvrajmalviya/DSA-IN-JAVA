package BASIC_JAVA;

public class IncrementDecrement_UnaryOperator {
    static void main() {
        //x++ (first print then increment) post increment
        int x = 10;
        //x++;  x = x + 1
        System.out.println(x++ +" "+x);

        //++y (first increment than print)
        int y = 10;
        System.out.println(++y + " " +y);

        //a-- (first print then decrement)
        int a = 10;
        System.out.println(a--);
        System.out.println(a);

        //--b (first decrement than print)
        int b = 10;
        System.out.println(--b);
        System.out.println(b);

        //example
        int p = 10;
        int q = p++;
        System.out.println(p+" "+q);
        int r = p--;
        System.out.println(p+" "+r);
        q = --p;
        System.out.println(p+" "+q);

    }
}
