package Loops.ForLoop;

public class DecreasingLoop {
    static void main() {
        //decrement i--
        //reverse 100 to 1
        int n = 100;
        for(int i = n; i>=1;i--) {
            if(i%2 !=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // reverse to table
        for (int i = 20; i >= 1; i = i - 2) {
            System.out.print(i + " ");
        }
    }
}