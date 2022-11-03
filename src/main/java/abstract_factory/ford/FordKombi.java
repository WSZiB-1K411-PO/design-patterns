package abstract_factory.ford;

import abstract_factory.EngineType;
import abstract_factory.Car;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FordKombi implements Car {
    private final EngineType engineType;

    @Override
    public void startEngine() {
        System.out.println("FordKombi::" + engineType + "::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("FordKombi::" + engineType + "::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("FordKombi::" + engineType + "::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("FordKombi::" + engineType + "::stop");
    }
}
