package arrayListActivity;

import java.util.ArrayList;

public class courseInfo {
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<Double> GPA = new ArrayList<>();
    ArrayList<Integer> Scores = new ArrayList<>();
    ArrayList<Character> letterGrade = new ArrayList<Character>();

    public void updateName(String name) {
        Name.add(name);
    }
    public void updateGPA(Double gpa){
        GPA.add(gpa);
    }
    public void updateScores(Integer scores){
        Scores.add(scores);
    }
    public void updateLetterGrade(Character Lettergrade){
        letterGrade.add(Lettergrade);
    }

    public void displayStudent(){
        System.out.printf("%-10s %-10f %-10c %d\n", "Name", "GPA", "Scores", "letter grade");
        for (int num = 0; num < Scores.size(); num++){
            System.out.printf("&-10s &-10f %-10c %d", Name.get(num), GPA.get(num), Scores.get(num), letterGrade.get(num));
        }
    }
}
