package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(11);
        arr.add(111);
        arr.add(1111);

        //iterating ArrayList for loop
        for(int i:arr)
            System.out.println(i);

        //Print ArrayList forEach()
        arr.forEach(ar -> System.out.println(ar));

        //Print Array general lambdaExpression
        Consumer<Integer> lambdaExpression = x -> System.out.println(x);
        arr.forEach(lambdaExpression);

        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }


}
