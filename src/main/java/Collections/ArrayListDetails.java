package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDetails {

    public static void main(String args[]){
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF"); //adds the element in list
        arraylist.add(0,"XX"); //adds elements and rest move 1 space to adjust
        arraylist.set(2,"WW"); //Updates the element at the index provided
        arraylist.remove("WW"); //remove the object from list

        System.out.println(arraylist.size()); //size() gets hte length of the list.

        //ArrayList to String Array
        String array2[] = arraylist.toArray(new String[arraylist.size()]);
        System.out.println(Arrays.toString(array2));

        //ArrayList yo Object array
        Object array1[] = arraylist.toArray();
        System.out.println(Arrays.toString(array1));

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for(String str: arraylist){
            System.out.println(str);
        }

        /* Sorting in decreasing order*/
        Collections.sort(arraylist, Collections.reverseOrder());

        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for(String str: arraylist){
            System.out.println(str);
        }


    }
}
