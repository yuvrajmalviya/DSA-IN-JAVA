package Java_Arrays;

public class OtherDatatypeArrays {
    static void main(String[] args) {
        //String
        String[] name = {"Yuvraj", "Rahul", "John"};
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
        //char
        char[] a = {'A','B', 'C'};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        //double
        double[] num = {23.2,234.34,334.2};
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
