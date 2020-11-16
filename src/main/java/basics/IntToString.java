package basics;

public class IntToString {

    static int i = 1234567890;
    static float f = 123.0f;

    public static void main(String[] args) {

        String s1 = Integer.toString(i);
        System.out.println(s1);
        System.out.println(s1.getClass().getName());

        String s2 = Float.toString(f);
        System.out.println(s2);
        System.out.println(s2.getClass().getName());

    }
}
