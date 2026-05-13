package Java_Arrays;

public class ArrayBasics {
    static void main() {
        int[] x = {6,17,69,9,171,5};

        //indexing
        System.out.println(x[0]);   //6
        System.out.println(x[4]);   //171

        //updating elements
        x[3] = 89;
        System.out.println(x[3]);

        int[] arr = new int[4]; //4 size of array
        arr[0] = 10;
        arr[1] = 72;
        arr[2] = -190;
        arr[3] = 90;

    }
}
