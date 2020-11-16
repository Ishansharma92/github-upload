package Practise;
/*
 i/p -  I AM AM LEARNING JAVA THE LANGUAGE JAVA JAVA, o/p -  AM JAVA
 */
import java.util.*;

public class PrintMultipleOccurredString {

    public static void main(String[] args) {
        String input = "I AM AM LEARNING JAVA THE LANGUAGE JAVA JAVA";
        String[] strArray = input.split(" ");
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();

        for(String x:strArray){
            if(lmap.containsKey(x)){
                lmap.put(x,lmap.get(x)+1);
            }
            lmap.putIfAbsent(x,1);
        }
        lmap.forEach((k,v) -> {
            if(v>1){
                System.out.print(k+" ");
            }
        });
    }
}
