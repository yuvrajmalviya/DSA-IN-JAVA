package MultiDimensionalArray;

import java.util.ArrayList;

public class ArrayList_2D_Basics {
    static void main(String[] args) {
        //New ArrayList
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        //How to add element in 2D arrayList
        //These array list array inside the 2D arraylist
//        {{3,5,8},{2,2,1,9},{0,6}}
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(5); a.add(8);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(2); b.add(2); b.add(1); b.add(9);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(0); c.add(6);

        //Add these list in a single list(2D list)
        arr.add(a); arr.add(b); arr.add(c);
        //Display arrayList as list
        System.out.println(arr);

        // print ArrayList Element as Matrix or raw-column form
        //using for loop
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

        //Using For each loop
        for(ArrayList<Integer> List1 : arr){
            for(int ele : List1){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
