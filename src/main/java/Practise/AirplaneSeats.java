package Practise;

import java.util.Scanner;
/*
Airplane Seating Arrangement, To find out if seatNumber allocated to passenger is Window, Middle or an Aile.

WW MM AA    AA MM WW
1  2  3      4  5  6
12 11 10     9  8  7
*/
public class AirplaneSeats {

    public static void main(String[] args) {
        System.out.print("What is your seat number? ");
        Scanner sc = new Scanner(System.in);
        int SeatNumber = sc.nextInt();

        findSeatArrangement(SeatNumber);
    }

    public static void findSeatArrangement(int SeatNumber){
        SeatNumber = SeatNumber%6;
        if(SeatNumber == 0 || SeatNumber == 1)
            System.out.println("Window");
        else if(SeatNumber == 2 || SeatNumber == 5)
            System.out.println("Middle");
        else
            System.out.println("Aile");
    }
}
