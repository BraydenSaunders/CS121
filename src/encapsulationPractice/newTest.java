package encapsulationPractice;

import java.util.Scanner;

public class newTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        newStudent student1 = new newStudent("Brayden","Sophomore", true, 90, 3.4);

        System.out.printf("FirstName: %s\n", student1.FirstName);
        System.out.printf("Year Title: %s\n", student1.yearTitle);


        student1.getStudentInfo();
        student1.getStudentCurrent();
        student1.getStudentRecord();
    }
}
//The variables that throw out errors are my minor boolean variable, my int highestGrade variable, and my double GPA variable.
//As a result of this, my getStudent method doesn't work because it entirely uses variables that can only be accessed in the newStudent class.