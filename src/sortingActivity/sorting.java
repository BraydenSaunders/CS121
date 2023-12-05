package sortingActivity;

import java.util.Scanner;

public class sorting {
    Scanner console = new Scanner(System.in);
    int tempValue;
    int[] array = new int[5];
    public int [] getArray(){
        //int[] array = new int[5];
        for(int i = 0; i< array.length; i++){
            System.out.println("Enter a number");
            array[i]= console.nextInt();
        }
        return array;
    }
    public int[] sortArray(int[] Array){
        for (int num = 0; num < array.length - 1; num++){
            for (int i = 0; i < array.length - num - 1; i++){
                if (Array[i] > Array[i + 1]){
                    tempValue = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = tempValue;
                }
            }
        }
        return Array;
    }
}
