package basics;

import java.util.HashMap;

public class GenericMainClass {
    public static void main(String[] args) {
        GenericSubClass<Integer> obj1 = new GenericSubClass<Integer>(10);
        GenericSubClass<Double> obj2 = new GenericSubClass<Double>(20.0);

        obj1.showType();
        obj2.showType();
    }
}

