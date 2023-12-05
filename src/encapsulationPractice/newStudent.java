package encapsulationPractice;

public class newStudent {
    String FirstName;
    String yearTitle;
    private boolean minor;
    private int highestGrade;
    private double GPA;
    public newStudent(String FirstName, String yearTitle, boolean minor, int highestGrade, double GPA){
        this.FirstName = FirstName;
        this.yearTitle = yearTitle;
        this.minor = minor;
        this.highestGrade = highestGrade;
        this.GPA = GPA;
    }
    public void getStudentInfo(){
        System.out.printf("First Name: %s\nYear Title: %s\nTaking a Minor: %b\nThe highest individual grade in a class: %d\nGPA: %.1f",
                FirstName,yearTitle,minor,highestGrade,GPA);
    }
    private void getStudent(){
        System.out.printf("First Name: %s\nYear Title: %s", FirstName,yearTitle);
    }
    protected void getStudentRecord(){
        System.out.printf("Year Title: %s\nGPA: %.1f\nThe highest individual grade in a class: %d", yearTitle,GPA, highestGrade);
        getStudent();
    }
    void getStudentCurrent(){
        System.out.printf("First Name: %s\nYear Title: %s\nTaking a Minor: %b\nThe highest individual grade in a class: %d",
                FirstName,yearTitle,minor,highestGrade);
    }
}
