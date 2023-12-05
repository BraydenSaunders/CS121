package sortingActivity;

public class sortingTest {
    public static void main(String[] args) {
        sorting inputArray = new sorting();
        int[] array = inputArray.getArray();
        System.out.println("----------Unsorted Array----------");
        displayUnsortedArray(array);
        inputArray.sortArray(array);
        System.out.println("----------Sorted Array----------");
        displaySortedArray(array);
    }
    public static void displayUnsortedArray(int [] Array){
        for (int num: Array){
            System.out.println(num);
        }
    }
    public static void displaySortedArray(int[] Array){
        for (int num: Array){
            System.out.println(num);
        }
    }
}
