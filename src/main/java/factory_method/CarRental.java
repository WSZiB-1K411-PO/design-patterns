package factory_method;

import java.util.concurrent.ThreadLocalRandom;

public class CarRental {
    public Car rentCar(String type) {
        switch (type) {
            case "Sedan":
                if(ThreadLocalRandom.current().nextBoolean()) {
                    return new AudiSedan();
                } else {
                    return new DaewooSedan();
                }
            case "Kombi":
                if(ThreadLocalRandom.current().nextBoolean()) {
                    return new BMWKombi();
                } else {
                    return new FordKombi();
                }
            default:
                return new FordKombi();
        }
    }
}
