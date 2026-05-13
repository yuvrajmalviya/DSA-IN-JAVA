package Loops.ForLoop;

public class BasicForLoop {
    static void main() {
//        System.out.println("Amair");
//        System.out.println("Amair");
//        System.out.println("Amair");
//        System.out.println("Amair");
//        System.out.println("Amair");
//        System.out.println("Amair");
//        System.out.println("Amair");
//        System.out.println("Amair");
        //instead of these use loops
        for(int i=1;i<=10;i++){
            System.out.print("Amir ");
        }
        System.out.println();

//        for(int i=-10;i<=10;i++){
//            System.out.print(i+"->");
//        }
        //initialization can also be written outside the for loop
        int i;
        for(i = -10; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(i);
    }

}
