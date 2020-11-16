package basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {

    public static void main(String[] args) {

        Map<String,Integer> h = new HashMap<>();
        h.put("Ishan",1);
        h.put("Ishan1",2);
        System.out.println(h.size());
        System.out.println(h.hashCode());
        System.out.println(h.keySet());
/*
        Iterator iterator = h.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry m =

            System.out.println();
        }

 */

    }
}
