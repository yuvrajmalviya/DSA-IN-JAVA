package String;

public class CompareToStringLexicographicallyWithoutCompareMethod {
    static void main(String[] args) {
        String s1 = "Harshita";
        String s2 = "Alok";
        System.out.println(CompareTO(s1, s2));
    }

    //If s1 == s2 return 0
    // If s1>s2 return positive no
    // If s1<s2 return negative no

    public static int CompareTO(String a, String b) {
        int n = Math.min(a.length(), b.length());
        for(int i=0; i<n; i++){
            if(a.charAt(i)!=b.charAt(i)) {
                return (a.charAt(i) - b.charAt(i));
            }
            }
        //This applies when two string character are same upto min length
        //Example --> s1 = "abc"
        //            s2 = "abcde"  --> s2 to only equal s1 after that s1 doesn't contain character
        return a.length() - b.length();
    }
}
