package Collections;

import java.util.*;
import java.util.Arrays;

public class ArrayToList {
    public static void main(String[] args) {
        String array[] = {"XX","AA","CC","FF"};
        List<String> al = Arrays.asList(array); //List is interface - object is created of ArrayList
        System.out.println(al);
        System.out.println(al.getClass().getName());

        //Array to Set
        Integer array1[] = {1,2,4,7,5,3,2,1,0,7};
        List<Integer> al1 = Arrays.asList(array1);
        TreeSet<Integer> t1 = new TreeSet<>(al1);
        System.out.println(t1);
    }
}
