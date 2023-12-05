package genericsActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class genericMain {
    public static void main(String[] args) {
        genericMethods generic = new genericMethods();

        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> characterArrayList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));

        generic.printArrayList(intArrayList);
        generic.printArrayList(doubleArrayList);
        generic.printArrayList(characterArrayList);
        generic.printArrayList(stringArrayList);
    }
}
