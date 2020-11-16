package Practise;

public class SubStringPalindrome2 {
    static String str = "sabsbas";
    static String rev = "", max = "";

    public static void main(String[] args) {
        if(str.length() <= 1){
            System.out.println(str);
        }
        for (int cnt = 0; cnt < str.length()-1; cnt++) {
            for (int innerCnt = cnt; innerCnt < str.length()-1; innerCnt++) {
                String strSub = str.substring(cnt, innerCnt);
                checkPalindrome(strSub, strSub.length());
            }
        }
        System.out.println(max);
    }

    private static void checkPalindrome(String s, int length) {
        for (int i = length - 1; i >= 0; i--)
            rev += s.charAt(i);

        if (s.equals(rev)) {
            if(max.length() < rev.length()){
                max = rev;
            }
        }
        rev = "";
    }
}
