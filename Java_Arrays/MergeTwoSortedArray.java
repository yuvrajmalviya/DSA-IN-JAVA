package Java_Arrays;

public class MergeTwoSortedArray {
    static void main(String[] args) {
        int a[] = {2,5,6,9,10};
        int b[] = {1,3,4,5,7,8};
        // create new array which will store elements of a & b in sorted array
        int c[] = new int[a.length+b.length];

        marge(c,a,b);
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
    public static void marge(int[] c, int[] a, int[] b) {
        int i = 0, j= 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                    c[k++]=b[j++];
//                    j++;
//                    k++;
            }
        }
        //Agar upar loop khtm ho gaya to agar element bache toh for that we add this -

        while(i<a.length){    //a ke bache huye element c me add karega
            c[k++] = a[i++];
        }
        while(j<b.length){    //a ke bache huye element c me add karega
            c[k++] = b[j++];
        }
    }
}
