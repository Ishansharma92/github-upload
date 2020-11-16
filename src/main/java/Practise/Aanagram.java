package Practise;

import java.util.Scanner;
import java.util.*;

/*
Anagram - String 1 - Life, String 2 - fiLe or fe li
String 1 - ABBA
String 2 - AABB , BBAA, BAAB, BA AB,
Map  - Occurance of char - compare with another
 */

public class Aanagram {

    static String s1;
    static String s2;
    static boolean flag;

    public static void main(String[] args) {
        getUserData();
        checkAnagram(s1, s2);
    }

    public static void getUserData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String: ");
        s1 = scan.nextLine();
        s1 = s1.toLowerCase();

        System.out.println("Enter second String: ");
        s2 = scan.nextLine();
        s2 = s2.toLowerCase();
        return;
    }

    public static void checkAnagram(String s1, String s2) {
        HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();

        for (char c1 : s1.toCharArray()) {
            if (c1 == ' ') {
                //Ignoring space
            } else if (m1.containsKey(c1)) {
                int v1 = m1.get(c1) + 1;
                m1.put(c1, v1);
            } else {
                int v1 = 1;
                m1.put(c1, v1);
            }
        }
        System.out.println(m1);

        for (char c2 : s2.toCharArray()) {
            if (c2 == ' ') {
                //Ignoring Space
            } else if (m1.containsKey(c2)) {
                int v2 = m1.get(c2) - 1;
                m1.put(c2, v2);
            } else {
                //new key found
                System.out.println("Not an Anagram");
                System.out.println(m1);
                return;
            }
        }
        System.out.println(m1);

        for (Integer value : m1.values()) {
            if (value != 0) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Not an Anagram");
        } else
            System.out.println("Anagram");
    }
}