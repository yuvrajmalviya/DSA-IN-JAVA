package Loops.ForLoop;

import java.util.Scanner;

public class Practice2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //print this sequence 1 n 2 n-1 3 n-2 4 n-3.....
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print(i+" ");
            System.out.print(n+" ");
            n-=1;
        }
        System.out.println();
        System.out.print("Enter number: ");
        int no = sc.nextInt();
        int x = 1;
        while(x<=no){
            System.out.print(x+" ");
            x++;
            System.out.print(no+" ");
            no-=1;
        }
    }

}
