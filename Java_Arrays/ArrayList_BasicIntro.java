package Java_Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_BasicIntro {
    static void main(String[] args) {

        //Creating an arraylist
        ArrayList<Integer> a = new ArrayList<>();
        //adding element
        a.add(123);
        a.add(2);
        a.add(87);
        a.add(91);

        //Print array element via index
        System.out.println(a.get(3));  //91  (like arr[3])

        //lenght or size of arraylist
        int n = a.size();
        //print array (loop is runing in backend )
        System.out.println(a); //[123, 2, 87, 91]

        //arraylist elements
        for(int ele: a){
            System.out.print(ele+" ");
        }
        System.out.println();
        //remove element
        a.remove(a.size()-1);  //remove the last element if array

        //collection
        Collections.reverse(a);  //reverse array
        System.out.println(a);
        int i=0, j=a.size()-1;
        while(i<j){
            int temp = a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);
            i++;
            j--;
        }
        for(int ele: a){
            System.out.print(ele+" ");
        }
    }
}
