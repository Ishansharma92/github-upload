package Practise;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringManupilation {

    static String str = "My Name is a b Mahesh Rakesh";
/*
    public static void main(String[] args) {
        String str11[] = str.split(" ");
        String min = str;
        String max = "";

        List<String> al = Arrays.asList(str11);
        TreeSet<String> str1 = new TreeSet<String>(al);
        LinkedHashSet<String> minset = new LinkedHashSet<>();
        LinkedHashSet<String> maxset = new LinkedHashSet<>();

        for(String s: str1){
            if(s.length()>=max.length()){
                max = s;
                maxset.add(max);
            }
            else if(s.length()<=min.length()){
                min = s;
                minset.add(min);
            }
        }

        System.out.println(minset);
        System.out.println(maxset);

        for(String x: minset){
            String temp = str;
            for (String y:maxset){
                temp = temp.replace(y,x);
            }
            System.out.println(temp);
        }
    }
 */

    public static void main(String[] args) {
        //Arrays.sort(str);
        String[] array = str.split(" ");
        LinkedHashSet<String> lhs = new LinkedHashSet<String>(Arrays.asList(array));





    }
}
