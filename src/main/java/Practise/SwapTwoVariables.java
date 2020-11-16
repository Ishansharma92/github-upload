package Practise;

public class SwapTwoVariables {

    static int a = 1;
    static int b = 2;
    public static void main(String[] args) {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " and " + b);
    }
}
