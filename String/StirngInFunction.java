package String;

public class StirngInFunction {
    static void main(String[] args) {
        String str = "Khushagrah";
        System.out.println(str);   // Khushagrah
        changeIn(str);
        //It also will print Khushagrah buz It is pass by value not reference
        System.out.println(str);   // Khushagrah
    }

    private static void changeIn(String x) {
        x = "MichelStark";
    }

}
