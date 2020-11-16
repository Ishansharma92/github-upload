package Practise;

public class SubString {
    static String s1 = "xyz";
    static String s2 = "yxyzy";

    public static void main(String[] args) {
        if (s1.contains(s2))
            System.out.println("s2: " + s2 + " is Substring of s1: " + s1);
        else if (s2.contains(s1))
            System.out.println("s1: " + s1 + " is Substring of s2: " + s2);
        else
            System.out.println("No Substring found");
    }
}
