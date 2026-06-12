package String;

public class SumOfAllSubstringsOfANumber {
    static void main(String[] args) {
        String s = "123";
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum=+s.charAt(i);
        }
        System.out.println(sum);
    }
}
