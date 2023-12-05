package HashMapActivity;

import HashMapActivity.MapSet;

import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        MapSet worldMap = new MapSet();

        for (int num = 0; num < 3; num++){
            System.out.println("\nEnter Capital");
            String Capital = console.nextLine();

            System.out.println("Enter Country");
            String Country = console.nextLine();

            worldMap.addCountiesAndCapitals(Capital, Country);
            worldMap.displayCountriesAndCapitals();
            while (num == 2){
                System.out.println("Do you want to remove any of these? Enter 'y' for yes and 'n' for no.");
                String removalQuestion = console.nextLine();
                if (removalQuestion.equals("y")){
                    worldMap.removeCountriesAndCapitals(Capital, Country);
                    worldMap.displayCountriesAndCapitals();
                    break;
                }
                else {
                    break;
                }
            }
        }
    }
}
