package String;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Yuvraj you are crazy!");
        //Declaration
        String x = "String is a sequence of character";
        System.out.println(x);
        System.out.println(x.length());

        //How to take Input
        System.out.print("Enter your name : ");
        //next() cannot take input after spacing
        String name = sc.next();  //  -->Yuvraj is my buddyy
        System.out.println(name);  // --> Yuvraj

        //
//        String array
//        char[] arr = {'y', 'u', 'v', 'r', 'a', 'j'};
//        for(char ele : arr){
//            System.out.print(ele +" ");
//        }
    }
}
