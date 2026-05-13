package Loops.ForLoop;

public class OddNumberDivisibleBy3 {
    static void main() {
        for(int i = 1; i<101; i++){
            if(i%2!=0 && i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
