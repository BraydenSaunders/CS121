package fileActivites;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter fileWrite = new FileWriter("courses.txt", true);
            PrintWriter output = new PrintWriter(fileWrite);

            String course = JOptionPane.showInputDialog("Enter course name: ");
            String credits = JOptionPane.showInputDialog("Enter course credits :");
            String score = JOptionPane.showInputDialog("Enter course score: ");
            output.printf("\n%s, %s, %s", course,credits,score);

            fileWrite.close();
            output.close();

        }catch (FileNotFoundException e){
            System.err.println("Error");
        }
    }
}
