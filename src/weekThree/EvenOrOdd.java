package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Password: ");

        int number = Integer.parseInt(console.nextLine());

        if(number %2 == 0){
            System.out.println("Your number is Even");
        }
        else{
            System.out.println("Your number is Odd");
        }

    }
}
