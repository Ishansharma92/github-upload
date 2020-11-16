package Practise;

/*
Anagram - String 1 - Life, String 2 - fiLe or fe li
String 1 - ABBA
String 2 - AABB , BBAA, BAAB, BA AB,
Map  - Occurance of char - compare with another
 */

import java.util.HashMap;

public class Aanagram2{
    static String s1 = "MOTHER IN LAW";
    static String s2 = "HITLER WOMAN";

    public static void main(String[] args) {
        HashMap<Character,Integer> hmap1 = new HashMap<>();
        HashMap<Character,Integer> hmap2 = new HashMap<>();

        for(char x: s1.toCharArray()){
            if(x!=' '){
                hmap1.putIfAbsent(x,1);
            }
            else if(hmap1.containsKey(x) && x!=' '){
                hmap1.put(x,hmap1.get(x)+1);
            }
        }

        for(char y: s2.toCharArray()){
            if(y!=' '){
                hmap2.putIfAbsent(y,1);
            }
            else if(hmap2.containsKey(y) && y!=' '){
                hmap2.put(y,hmap2.get(y)+1);
            }
        }

        if(hmap1.equals(hmap2)){
            System.out.println("Anagram");
        }
        else
            System.out.println("Not an Anagram");
    }
}