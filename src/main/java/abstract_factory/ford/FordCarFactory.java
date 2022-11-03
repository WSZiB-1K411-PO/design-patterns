package abstract_factory.ford;

import abstract_factory.Car;
import abstract_factory.CarFactory;
import abstract_factory.EngineType;
import abstract_factory.daewoo.*;

public class FordCarFactory implements CarFactory {
    @Override
    public Car produce(String type, EngineType engineType) {
        return switch (type) {
            case "Sedan" -> new FordSedan(engineType);
            case "Kombi" -> new FordKombi(engineType);
            default -> new FordSedan(engineType);
        };
    }
}
