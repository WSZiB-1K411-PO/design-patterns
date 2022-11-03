package abstract_factory.ford;

import abstract_factory.EngineType;
import abstract_factory.Car;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FordSedan implements Car {
    private final EngineType engineType;

    @Override
    public void startEngine() {
        System.out.println("FordSedan::" + engineType + "::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("FordSedan::" + engineType + "::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("FordSedan::" + engineType + "::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("FordSedan::" + engineType + "::stop");
    }
}
