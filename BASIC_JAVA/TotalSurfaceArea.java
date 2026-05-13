package BASIC_JAVA;

public class TotalSurfaceArea {
    static void main() {
        double l,b,h;
        l = 34.2;
        b = 32.12;
        h = 7.8;

        double TSA = 2*((l*b)+(b*h)+(l*h));
        System.out.println("Total surface Area is : "+TSA);
    }
}
