package LoopsActivities;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How many years?");
        int years = console.nextInt();
        int months = 0;
        int yearlyRain = 0;

        for (int x = 1; x <= years; x++) {
            months += 12;
            for (int y = 1; y <= 12; y++){
                System.out.println("\nHow many inches of rainfall for month "+y+" in year " +x+".");
                yearlyRain += console.nextInt();
            }
        }
        System.out.printf("\nTotal number of months: %d", months);
        System.out.printf("\nTotal inches of rainfall: %d", yearlyRain);
        System.out.printf("\nAverage rainfall per month for %d year: %.2f", years, (double)yearlyRain / (double)years);
    }
}