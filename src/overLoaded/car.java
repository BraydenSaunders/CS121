package overLoaded;

public class car {
    String carType;
    int miles;
    int yearsOld;
    boolean used;

    public car(){
    }
    public car(String carName){
        this.carType = carName;
    }
    public  car(String carName, int mileage, int years, boolean usedCar){
        this.carType = carName;
        this.miles = mileage;
        this.yearsOld = years;
        this.used = usedCar;
    }

    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getMiles() {
        return miles;
    }
    public void setMiles(int carMiles) {
        this.miles = carMiles;
    }
    public void setMiles(int carMiles, boolean Usedcar) {
        if (carMiles >= 120000){
            Usedcar = false;
        }
    }
    public int getYearsOld() {
        return yearsOld;
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
