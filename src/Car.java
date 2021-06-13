public class Car {
    public String model;
    public String color;
    public String makeYear;
    public String fuelType;

    public Car() {

    }

    public Car(String model, String color, String makeYear, String fuelType) {
        this.model = model;
        this.makeYear = makeYear;
        this.fuelType = fuelType;
        this.color = color;
    }

    public Car(String model, String color, String fuelType) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }

    public void startEngine(){
        System.out.println("Silnik "+ this.model +" został uruchomiony");
    }

    public void stopEngine(String percent){
        System.out.println("Silnik został zwolniony o "+ percent);
    }
}
