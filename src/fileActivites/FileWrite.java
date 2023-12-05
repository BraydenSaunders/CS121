package fileActivites;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        try {
            PrintWriter output = new PrintWriter("courses.txt");
            output.print("course credits score");

            String course = JOptionPane.showInputDialog("Enter Course name: ");
            String credits = JOptionPane.showInputDialog("Enter credits: ");
            String score = JOptionPane.showInputDialog("Enter Letter score");
            output.printf("\n%s %s %s", course,credits,score);

            output.close();

        }catch (FileNotFoundException e){
            System.err.println("Error");
        }
    }
}