package Practise;

public class SubStringPalindrome {
    static String str = "agdjsabssbaskejh";
    static int resultStart;
    static int resultLength;

    public static void main(String[] args) {
        int strLength = str.length();
        System.out.println("length of the String: " + strLength);
        if(strLength <= 1){
            System.out.println(str);
        }
        for(int start = 0; start < str.length(); start++){
            checkPalindrome(str, start, start);
            checkPalindrome(str, start, start + 1);
        }
        System.out.println(str.substring(resultStart, resultStart + resultLength));
    }

    private static void checkPalindrome(String str, int begin, int end) {
        while(begin >= 0 && end < str.length() &&
                    str.charAt(begin) == str.charAt(end)){
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
}
