package Collections;


import java.util.HashSet;

public class EnumDeclaration {
    enum days{
        Mon, Tue, Wed, Thur, Fri, Sat, Sun
    }
    public static void main(String[] args) {
        HashSet<days> d1 = new HashSet<>();
        d1.add(days.Mon);
        System.out.println(d1);
    }
}
