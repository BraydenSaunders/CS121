package overLoaded;

public class carTest {
    public static void main(String[] args) {
        car tesla = new car();
        car subaru = new car("Outback");
        car honda = new car("Civic",120000, 40,true);

        System.out.printf("Car name: %s\n", tesla.getCarType());
        tesla.setCarType("Outback");
        System.out.printf("\nCar mileage: %d\n", subaru.getMiles());
        subaru.setMiles(110000);
        System.out.printf("\nThe is used: %b\n", honda.getMiles());
        honda.setMiles(110000);
    }
}
