package String;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Rajasthan";
        StringBuilder str = new StringBuilder(s);
//        str.reverse();
//        System.out.println(str);

        //without reverse method
        int i=0, j = str.length()-1;
        while(i<=j){
            char temp1 = str.charAt(i);
            char temp2 = str.charAt(j);
            str.setCharAt(i,temp2);
            str.setCharAt(j,temp1);
            i++;
            j--;
        }
        s = str.toString();
        System.out.println(s);
    }
}
