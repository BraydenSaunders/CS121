package weekTwo;

import java.util.Scanner;

public class IntegerDiv {
    public static void main(String[] args) {
        //creating an instance of the scanner class
        Scanner console = new Scanner(System.in);

        String color = "blue";
        color = color.concat("Red");
        System.out.println(color);

        //Name
        System.out.println("Enter your name");
        String name = console.nextLine();
        System.out.println(name);

        //String name = "Brayden";
        System.out.println(name.charAt(3));

        //Age
        System.out.println("Enter in age");
        int age = console.nextInt();
        System.out.println(age);

        //GPA
        System.out.println("Enter in gpa");
        double gpa = console.nextInt();
        System.out.println(gpa);

        int numOne = 1200000000;
        int numTwo = 400000;
        int result1 = numOne/numTwo;
        //double result = (double)(numOne/numTwo);

        System.out.println(result1);


        console.close();

    }
}