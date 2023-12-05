package classesActivity.folder;

public class Instructor {
    String name;
    String subject;
    int yearsTeaching;
    int age;
    public Instructor(){
        this.name = "Enter";
        this.subject = "Enter";
        this.yearsTeaching = 0;
        this.age = 0;
    }
    public void setYearsTeaching(int yearsOfTeaching){
        this.yearsTeaching = yearsOfTeaching;
    }
    public void celebration(){
        if(yearsTeaching >= 10){
            System.out.println("Congratulations for your many years of teaching!");
        }
        else{
            System.out.println("Keep at it! Your students appreciate you!");
        }
    }
}
