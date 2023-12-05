package LoopsActivities;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How many students are there?");
        int studentNumber = console.nextInt();

        System.out.println("How many scores are there per student.json?");
        int scoresPerStudent = console.nextInt();

        for (int x = 1; x <= studentNumber; x++) {
            System.out.println("\nStudent " + x + ":");
            int resetScore = 0;
            for (int y = 1; y <= scoresPerStudent; y++) {
                System.out.printf("Enter this student.json's score: ", y);
                resetScore += console.nextInt();
            }
            System.out.printf("The average for student.json %d is: %f", x, (double)resetScore/ (double)scoresPerStudent);
        }
    }
}