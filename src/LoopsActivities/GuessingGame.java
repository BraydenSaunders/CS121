package LoopsActivities;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int answer = (int)(Math.random()*100);
        if(answer == 0)
            answer = 1;
        int guesses = 0;
        System.out.println("Guess a number between 1 and 100 (Or press q to quit): ");
        String input = console.nextLine();
        while(!input.equals("q")){
            int guessedNumber = Integer.parseInt(input);
            guesses += 1;
            if (guessedNumber == answer){
                System.out.println("Correct!");
                System.out.printf("Number of guesses: %d", guesses);
                return;
            }
            else {
                if(guessedNumber < answer){
                    System.out.println("Too low! Guess again");
                }
                else{
                    System.out.println("Too high! Guess again");
                }
                input = console.nextLine();

            }
        }
        System.out.printf("Quitter. The number was %d", answer);
    }
}
