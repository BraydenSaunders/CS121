package genericsActivity;

import java.util.ArrayList;

public class genericMethods {
    public <T> void printArrayList(ArrayList<T> inputArrayList){
        for (T element : inputArrayList){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
