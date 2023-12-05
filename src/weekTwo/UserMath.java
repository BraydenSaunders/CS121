package weekTwo;

import java.util.Scanner;

public class UserMath {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter your second number:");
        int numTwo = Integer.parseInt(console.nextLine());

        int add = numOne + numTwo;
        int subtract = numOne - numTwo;
        int multiply = numOne * numTwo;
        double divide = (double)numOne / (double)numTwo;
        double sqrt1 = Math.sqrt(numOne);
        int power1 = (int)Math.pow(numOne, numTwo);
        double log1 = Math.log(numOne);

        System.out.printf("The number %d + %d = %d \n",numOne,numTwo,add);
        System.out.printf("The number %d - %d = %d \n",numOne,numTwo,subtract);
        System.out.printf("The number %d * %d = %d \n",numOne,numTwo,multiply);
        System.out.printf("The number %d / %d = %.2f \n",numOne,numTwo,divide);
        System.out.printf("The square root of %d is = %.2f \n",numOne, sqrt1);
        System.out.printf("The power of %d and %d is = %d \n",numOne,numTwo,power1);
        System.out.printf("The log of %d is = %.2f \n",numOne, log1);

    }
}
