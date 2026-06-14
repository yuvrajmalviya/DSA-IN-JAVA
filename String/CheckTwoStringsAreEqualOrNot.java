package String;

public class CheckTwoStringsAreEqualOrNot {
    static void main(String[] args) {
        String s1 = new String("Yuvraj");
        String s2 = new String("Yuvraj");

        // s1.equals(s2) = It compare String character by character, return true if equals else false
        System.out.println(s1.equals(s2)); //true

        //why we don't use s1==s2
        System.out.println(s1==s2); //false
        String a = "india";
        String b = "india";
        //"india" is store in memory, a & b are just two different name of same string
        System.out.println(a==b); //true

        System.out.println(equals(s1,s2));

    }
        //check equality of two string without using equal method
    public static boolean equals(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
}