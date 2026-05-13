package Java_Arrays;

public class AddMutiplicationInEvenOddIndex {
        public static void AddMulti(int[] chan) {
            for (int i = 0; i <= chan.length; i++) {
                if (i % 2 != 0) {
                    System.out.print(chan[i]*2 + " ");
                } else {
                    System.out.print(10 + chan[i] + " ");
                }
            }
        }
    static void main() {
        int[] arr = {1, 3, 5, -23, 12, 8, 34, 2};
        AddMulti(arr);
    }
}