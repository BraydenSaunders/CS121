package classesActivity;

import classesActivity.folder.Instructor;
import classesActivity.folder.student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        student BallState = new student();
        BallState.setGPA(2.0);
        BallState.shoutIfDoingPoorly();

        Instructor bsu = new Instructor();
        bsu.setYearsTeaching(12);
        bsu.celebration();
    }
}