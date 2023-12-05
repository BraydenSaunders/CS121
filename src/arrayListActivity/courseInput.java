package arrayListActivity;

import java.util.Scanner;

public class courseInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        courseInfo test = new courseInfo();
        while (true){
            System.out.println("Enter name or press q to quit");
            String name = console.nextLine();
            if (name.toLowerCase().equals("q")){
                System.out.println("Goodbye!");
                break;
            }
            else {
                test.updateName(name);
            }
            System.out.println("Enter GPA");
            Double GPA = Double.parseDouble(console.nextLine());
            test.updateGPA(GPA);

            System.out.println("Enter score");
            int score = Integer.parseInt(console.nextLine());
            test.updateScores(score);

            System.out.println("Enter average letter grade");
            char lettergrade = console.next().charAt(0);
            test.updateLetterGrade(lettergrade);
        }
    }
}