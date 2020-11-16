package basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();
        items.put("coins", 5);
        items.put("pens", 2);
        items.put("chairs", 7);

        items.forEach((k, v) -> {
            System.out.println("key: " +k +" , " +"Value: " +v);
        });
    }
}
