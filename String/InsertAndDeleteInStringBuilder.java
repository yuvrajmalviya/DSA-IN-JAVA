package String;

public class InsertAndDeleteInStringBuilder {
    static void main(String[] args) {
        String s = "Rajasthan";
        StringBuilder str = new StringBuilder(s);
        //delete char at index 3
        str.deleteCharAt(2);
        //delete char between index 3 to 5
        str.delete(3,6);
        //insert char at index 6
        str.insert(5, 'k');

        System.out.println(str);
    }
}
