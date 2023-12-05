package jsonActivity;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class JSONStudentWriter {
    public static void main(String[] args) {
        try {
            JSONStudent student = new JSONStudent("Kingberry Nickelback", 901653905, "Journalism");
            Gson gson = new Gson();
            String JSONString = gson.toJson(student);
            FileWriter fileWriter = new FileWriter("student.json");
            fileWriter.write(JSONString);
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
