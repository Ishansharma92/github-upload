package Practise;

public class Palindrome {

    static String rev = "";

    public static void main(String[] args) {

        int num = 245642;
        String s = Integer.toString(num);
       // String s = "abba";

        checkPalindrome(s, s.length());
    }

    private static void checkPalindrome(String s, int length) {
        for (int i = length - 1; i >= 0; i--)
            rev += s.charAt(i);

        if(s.equals(rev)){
            System.out.println("Palindrome");
        } else
            System.out.println("Not Palindrome");
    }
}
