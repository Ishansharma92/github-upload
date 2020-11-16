package Collections;

import java.util.*;

public class ReverseOfStringArrayList {
    static String s1 = "Ishan";
   static char c1[]= s1.toCharArray();

    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>();
        for(char c:c1) {
            al.add(c);
        }
        Collections.reverse(al);
        System.out.println(al);
    }
}
