package String;

public class AddIntCharStringUsingPlusOperator {
    static void main(String[] args) {
        String s = "Yuvraj";
        // Add two String
        s += " Malviya";
        System.out.println(s);
        //We can add integer to string
        s = s+2;
        System.out.println(s);
        //Add character in string
        s = s+'a';
        System.out.println(s);
//        single character + int = print sum of ASCII value and Int
        System.out.println('A'+2+"Isha"); //67Isha

        // "/n" to print string in next line after /n
        s += '\n';
        s += "Rajsthan";
        System.out.println(s);
        // Both number will add to string
        // Java start printing from left to right
        // 1st --> raghav+10 (raghav -string & 10 - integer) so the both will add as string
        // 2nd --> raghav10(String) + 20(int) so they both will add as string+int= string
        System.out.println("raghav"+10+20);
        // it will print 30raghav
        //As we know java start printing form left to right
        // 1st 10+20 = 30
        //2nd 30+raghav = 30 raghav
        System.out.println(10+20+"raghav");
        // 10+raghav = 10raghav then 10raghav+20 = 10raghav20
        System.out.println(10+"raghav"+20);
    }
}
