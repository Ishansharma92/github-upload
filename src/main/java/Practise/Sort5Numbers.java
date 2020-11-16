package Practise;

import java.util.ArrayList;
import java.util.Collections;

public class Sort5Numbers {

    static int n1 = 11;
    static int n2 = 11;
    static int n3 = 21;
    static int n4 = 72;
    static int n5 = 4;

    public static void main(String[] args) {
        sortingNumbers();
    }
    public static void sortingNumbers(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(n1);
        al.add(n2);
        al.add(n3);
        al.add(n4);
        al.add(n5);
        Collections.sort(al);
        System.out.println(al);
    }
}
