package LoopsActivities;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How many floors does the hotel have?");

        int hotelFloors = Integer.parseInt(console.nextLine());
        int roomCount = 0;
        int roomOcc = 0;

        for (int num = 1; num <= hotelFloors; num++) {
            System.out.println("How many rooms are on Floor " + num + "?");
            roomCount += Integer.parseInt(console.nextLine());

            System.out.println("How many of those rooms are occupied?");
            roomOcc += Integer.parseInt(console.nextLine());
        }
        double occRate = (double)roomOcc / (double)roomCount;

        System.out.printf("\nFloors: %d", hotelFloors);
        System.out.printf("\nRooms: %d", roomCount);
        System.out.printf("\nOccupied Rooms: %d", roomOcc);
        System.out.printf("\nVacant Rooms: %d", (roomCount - roomOcc));
        System.out.printf("\nOccupancy: %f", occRate);
    }
}