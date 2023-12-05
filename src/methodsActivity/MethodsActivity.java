package methodsActivity;

import java.util.Scanner;

public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double l = getLength();
        double w = getWidth();
        double a = getArea(l,w);
        System.out.printf("Length of Rectangle: %.1f\nWidth of Rectangle: %.1f\nArea of Rectangle: %.1f",l,w,a);
        scanner.close();
    }

    public static double getLength() {
        System.out.println("Enter the length of rectangle:");
        double length = Double.parseDouble(scanner.nextLine());
        return length;
    }

    public static double getWidth() {
        System.out.println("Enter the width of rectangle:");
        double width = Double.parseDouble(scanner.nextLine());
        return width;
    }

    public static double getArea(double l, double w) {
        double area = l * w;
        return area;
    }
}