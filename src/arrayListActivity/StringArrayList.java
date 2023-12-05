package arrayListActivity;

import java.util.ArrayList;

public class StringArrayList {
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<Double> GPA = new ArrayList<>();
    ArrayList<Integer> Scores = new ArrayList<>();
    ArrayList<Character> letterGrade = new ArrayList<>();

    public void addScore(int score){
        this.Scores.add(score);
    }
    public int getScore(int index){
        return Scores.get(index);
    }
    public int getSizeOfScoreList(){
        return Scores.size();
    }
    public void removeScore(int score){
        this.Scores.remove(score);
    }
    public void displayScores1(){
        System.out.printf("Scores: %n");
        for(Object Score : Scores){
            System.out.printf("%d%n", Score);
        }
    }
    public void displayScores2(){
        System.out.printf("Scores: %n");
        for(int i = 0; i < Scores.size(); i++){
            System.out.printf("%d%n", Scores.get(i));
        }
    }
}
