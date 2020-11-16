package Practise;

/*
Reverse String "i am xyz" to "xyz am i"
 */

public class ReverseSentence {
    static String s = "i am xyz";
    static String result = "";

    public static void main(String[] args) {
        String s1[] = s.split(" ");
        //System.out.println(Arrays.deepToString(s1));
        for (int i = s1.length-1; i>=0 ; i--){
            result += s1[i] + " ";
        }
        System.out.println(result);
    }
}
