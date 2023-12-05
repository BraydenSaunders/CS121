package classesActivity.folder;

public class student {
    String fullName;
    String major;
    int yearsOfStudy;
    double GPA;
    public student(){
        this.fullName = "Enter";
        this.major = "Enter";
        this.yearsOfStudy = 0;
        this.GPA = 0.0;
    }
    public double getGPA(){
        return GPA;
    }
    public void setGPA(double gpa) {
        this.GPA = gpa;
    }
    public void shoutIfDoingPoorly(){
        if(GPA <= 2.0){
            System.out.println("You are doing poorly in school!!!! Get your act together!!!!\n");
        }
        else{
            System.out.println("You are doing great in school!!!! Keep it up!!!!\n");
        }
    }
}