package jsonActivity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONStudentReader {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            JSONStudent student = gson.fromJson(reader, JSONStudent.class);
            System.out.println("-----Student Info-----");
            System.out.printf("Student Name: %s\nID: %d\nMajor: %s", student.getName(), student.getID(), student.getMajor());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}