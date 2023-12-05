package weekThree;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Length 1: ");
        int number1 = Integer.parseInt(console.nextLine());

        System.out.println("Length 2: ");
        int number2 = Integer.parseInt(console.nextLine());

        System.out.println("Length 3: ");
        int number3 = Integer.parseInt(console.nextLine());

        if (number1 == number2 && number1 == number3){
            System.out.println("You have an Equilateral Triangle!");
        }
        if ((number1 == number2) || (number1 == number3) || (number2 == number3)) {
            System.out.println("You have an Isosceles Triangle!");
        }
        if (number1 != number2 && number1 != number3 && number2 != number3){
            System.out.println("You have a Scalene Triangle!");
        }
    }
}