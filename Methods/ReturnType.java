package Methods;

public class ReturnType {
    public static int number(int a){
//        System.out.println("first");
//        System.out.println("Second");
        if(a>0) return 5;
        else return 10;
    }

    static void main() {
        int x = number(7);
        System.out.println(3+x);
    }
}
