package String;

public class InteringNewKeyword {
    static void main(String[] args) {
        String s = "Radhika";
        s = "Gidwani";
        //Both string points to different memory location,
        //Hence we know string is immutable so it would never change
        //when we Gidwani is store in different location
        //basically here new string is created
        s += "nuh"; //it'll also create new string

        String p = "Hello";
        String t = "Hello";
        //Both string lies on same memory location
        // p --> "Hello" <-- t
        //only names are different

        String a = new String("Hello");
        System.out.println(a);
        //using new keyword we can create new string
    }
}
