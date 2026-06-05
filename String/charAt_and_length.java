package String;

public class charAt_and_length {
    static void main(String[] args) {
//                     012345678
        String name = "Chetaniya";
        //In other programming we can direct write name[4] but in java we have to use charAt()
        char character = name.charAt(4);  // --> a
        System.out.println(character);

        //length
        System.out.println(name.length());
    }
}
