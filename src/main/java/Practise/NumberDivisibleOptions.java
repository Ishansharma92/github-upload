package Practise;

import java.util.Scanner;

public class NumberDivisibleOptions {

    public static void main(String[] args) {
        System.out.print("What is your number? ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        divisibilityOption(number);
    }

    public static void divisibilityOption(int number){

        if(number%3 == 0 && number%5 == 0)
            System.out.println("BestWest");
        else if(number%3 == 0)
            System.out.println("Best");
        else if(number%5 == 0)
            System.out.println("West");
        else
            System.out.println("Not divisible by 3 or 5");
    }
}
