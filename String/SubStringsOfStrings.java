package String;

public class SubStringsOfStrings {
    static void main(String[] args) {
        String s = "Jaishankar";
        //sunstring = continuous part of string like jai, shan, ka, r
        System.out.println(s.substring(3));  // index 3 to s.length()
        System.out.println(s.substring(1,5)); //index 1 to 4

        //all substring
        String s1 = "Alok";
        for(int i=0; i<s1.length(); i++){
            for(int j=i; j<=s1.length(); j++){
                System.out.print(s1.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
