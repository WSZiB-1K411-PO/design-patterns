package abstract_factory.daewoo;

import abstract_factory.Car;
import abstract_factory.CarFactory;
import abstract_factory.EngineType;

public class DaewooCarFactory implements CarFactory {
    @Override
    public Car produce(String type, EngineType engineType) {
        return switch (type) {
            case "Sedan" -> switch (engineType) {
                case PETROL -> new DaewooPetrolSedan();
                case DIESEL -> new DaewooDieselSedan();
                case ELECTRIC -> new DaewooElectricSedan();
                };
            case "Kombi" -> switch (engineType) {
                case PETROL -> new DaewooPetrolKombi();
                case DIESEL -> new DaewooDieselKombi();
                case ELECTRIC -> new DaewooElectricKombi();
            };
            default -> new DaewooPetrolSedan();
        };
    }
}
