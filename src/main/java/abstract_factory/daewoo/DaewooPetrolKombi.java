package abstract_factory.daewoo;

import abstract_factory.Car;

public class DaewooPetrolKombi implements Car {
    @Override
    public void startEngine() {
        System.out.println("DaewooPetrolKombi::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("DaewooPetrolKombi::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("DaewooPetrolKombi::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("DaewooPetrolKombi::stop");
    }
}
