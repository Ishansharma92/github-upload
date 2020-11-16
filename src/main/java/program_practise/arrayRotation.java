package program_practise;

import java.util.Arrays;

public class arrayRotation {

    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5};
        int len = arr.length;
        int rotationCount = 4;
        rotationCount = rotationCount > len ? rotationCount % len : rotationCount; //ternery operater

        for (int i = 0; i < rotationCount; i++) {
            int temp, j;
            temp = arr[0];
            for (j = 0; j < len - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
