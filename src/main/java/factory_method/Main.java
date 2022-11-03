package factory_method;

public class Main {
    public static void main(String[] args) {
        CarRental carRental = new CarRental();

        use(carRental.rentCar("Sedan"));
        use(carRental.rentCar("Kombi"));
        use(carRental.rentCar("Coupe"));
    }

    public static void use(Car car) {
        car.startEngine();
        car.accelerate();
        car.stop();
        car.stopEngine();
        System.out.println();
    }
}
