package Practise;

import java.util.*;

public class ArrayPractise {

    //Array [1,2,3,1,2,3,2,2,3,1] to Array[1,2,3]

    public static void main(String args[]) {

        Integer[] i = {1, 2, 3, 1, 2, 3, 2, 2, 3, 1, 11};
        Integer[] result = new Integer[i.length];
/*
        HashSet<Integer> s = new HashSet<Integer>();
        for (int x : i) {  //Implicit Type Cast
            s.add(x);
        }
        Object[] i1 =s.toArray();   //Explicit Type Cast
        System.out.println(Arrays.toString(i1));
*/


        for (int count = 0; count < i.length; count++) {
            int innerCount = 0;

            while (innerCount <= count) {
                if (null == result[innerCount]) {
                    result[innerCount] = i[count];
                }
                if (result[innerCount] != i[count])
                    innerCount++;
                else
                    break;

            }
        }
    }
}
