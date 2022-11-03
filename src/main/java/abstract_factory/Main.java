package abstract_factory;

import abstract_factory.daewoo.DaewooCarFactory;
import abstract_factory.ford.FordCarFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        use(new DaewooCarFactory());
        use(new FordCarFactory());
    }

    public static void use(CarFactory carFactory) {
        use(carFactory.produce("Sedan", EngineType.getRandom()));
        use(carFactory.produce("Kombi", EngineType.getRandom()));
    }

    public static void use(Car car) {
        car.startEngine();
        car.accelerate();
        car.stop();
        car.stopEngine();
        System.out.println();
    }
}
