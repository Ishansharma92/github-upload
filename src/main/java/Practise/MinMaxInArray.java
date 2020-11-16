package Practise;

import java.util.Arrays;

public class MinMaxInArray {

    static int ar[] = {1,2,5,100,9,2,0,-20};

    public static void main(String[] args) {
        int Min = ar[0], Max = ar[0];
        for (int i = 0; i<ar.length; i++){
            if(Min>ar[i])
                Min = ar[i];
            else if (Max<ar[i])
                Max = ar[i];
        }
        int diff = Max - Math.abs(Min);
        System.out.println(Arrays.toString(ar));
        System.out.println("Difference in Min and Max number in array is: " +diff);
    }
}
