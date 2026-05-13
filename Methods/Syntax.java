package Methods;

public class Syntax {
    public static void harsh() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");  //this function only execute if function is called in main function
        }
    }
    static void main() {
        hello(); //function call
        System.out.println("Roshan");
        harsh(); //function call
    }
    public static void hello(){
        System.out.println("Hello");
    }
}
