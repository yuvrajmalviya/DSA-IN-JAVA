package String;

public class ReverseWordInStringIII {
    static void main(String[] args) {
        String str = "Let's take Leetcode contest";
        String res = reverse(str);
        System.out.println(res);
    }
        public static String reverse(String s){
            char[] char_arr = s.toCharArray();
            int st = 0;
            for (int end = 0; end < char_arr.length; end++) {
                if (end == char_arr.length || char_arr[end] == ' ') {
                    reverseString(char_arr, st, end - 1);
                    st = end + 1;
                }
            }
            return new String(char_arr);
    }

    public static void reverseString(char[] char_arr, int st, int end) {
        while(st<end){
            char temp = char_arr[st];
            char_arr[st] = char_arr[end];
            char_arr[end] = temp;
            st++;
            end--;
        }
    }
}
