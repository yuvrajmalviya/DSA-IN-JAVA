package String;

public class SumOfAllSubstringsOfANumber {
    static void main(String[] args) {
        String s = "6759";
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String sub = s.substring(i,j+1);
                sum += Integer.parseInt(sub);
            }
        }
        System.out.println(sum);  //8421
    }
}
