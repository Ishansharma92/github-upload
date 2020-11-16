package Practise;

import java.util.Arrays;

public class Aanagram3 {

    static String a = "MOTHER IN LAW";
    static String b = "HITLER WOMAN";

    public static void main(String[] args) {
        char[] a1 = a.replace(" ","").toLowerCase().toCharArray();
        char[] b1 = b.replace(" ","").toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        if(Arrays.equals(a1,b1))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
