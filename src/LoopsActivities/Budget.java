package LoopsActivities;

import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Monthly Budget:");
        int budget = console.nextInt();

        System.out.println("Expenses:");
        int expenses = console.nextInt();

        System.out.println("Expense (enter 0 if you're done): ");
        int number = console.nextInt();

        while (number > 0) {
            expenses += number;
            System.out.println("Expense (enter 0 if you're done): ");
            number = console.nextInt();
        }
        if (expenses > budget) {
            System.out.printf("Budget: $%d\nExpenses: $%d\nOver Budget: $%d", budget, expenses, (expenses - budget));
        }
        else {
            System.out.printf("Budget: $%d\nExpenses: $%d\nUnder Budget: $%d", budget, expenses, (budget - expenses));
        }
    }
}