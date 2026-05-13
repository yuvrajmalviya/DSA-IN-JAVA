package Loops;

public class ContinueStatement {
    static void main() {
        for(int i =1; i<=100;i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
