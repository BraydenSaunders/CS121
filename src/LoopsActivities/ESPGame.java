package LoopsActivities;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        int numberOfTrials = 10;

        int scoreCount = 0;

        for (int num = 1; num <= numberOfTrials; num++){
            int chosenNumber = random.nextInt(5);
            System.out.println(num+". What color has the computer chosen? Input number: 0 = red, 1 = green, 2 = blue, 3 = orange, 4 = yellow");
            int input = console.nextInt();
            if (input == 0){
                System.out.println("You chose red");
            }
            if (input == 1){
                System.out.println("You chose green");
            }
            if (input == 2){
                System.out.println("You chose blue");
            }
            if (input == 3){
                System.out.println("You chose orange");
            }
            if (input == 4){
                System.out.println("You chose yellow");
            }

            if (chosenNumber == 0){
                System.out.println("The computer chose red");
            }
            if (chosenNumber == 1){
                System.out.println("The computer chose green");
            }
            if (chosenNumber == 2){
                System.out.println("The computer chose blue");
            }
            if (chosenNumber == 3){
                System.out.println("The computer chose orange");
            }
            if (chosenNumber == 4){
                System.out.println("The computer chose yellow");
            }
            if (input == chosenNumber){
                scoreCount++;
            }
        }
        System.out.printf("---------Results----------");
        System.out.printf("\nYou got "+scoreCount+" out of 10");
    }
}