package dateFormatActivity;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int caloriesPerDay = Integer.parseInt(JOptionPane.showInputDialog("How many Calories per day?"));
        String startingDate = JOptionPane.showInputDialog("When will you start? Enter mm/dd/yyyy");
        String endingDate = JOptionPane.showInputDialog("When will you end? Enter mm/dd/yyyy");

        TotalCalories test = new TotalCalories();
        System.out.printf("Total Calories: %,d", test.dietStats(caloriesPerDay, startingDate, endingDate));
    }
}
