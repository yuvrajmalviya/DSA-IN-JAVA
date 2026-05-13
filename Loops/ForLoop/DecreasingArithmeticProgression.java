package Loops.ForLoop;

public class DecreasingArithmeticProgression {
    static void main() {
        //99,95,91,87....upto all terms which are positive

        for(int i = 99;i>=1;i=i-4){
            System.out.print(i+" ");
        }
        System.out.println();
        //another way
        int a = 99, d = 4;
        for(int i = a; i>=1; i--){
            System.out.print(i+" ");
            a+=d;
        }

        }
    }

