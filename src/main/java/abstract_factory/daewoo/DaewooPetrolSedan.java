package abstract_factory.daewoo;

import abstract_factory.Car;

public class DaewooPetrolSedan implements Car {
    @Override
    public void startEngine() {
        System.out.println("DaewooPetrolSedan::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("DaewooPetrolSedan::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("DaewooPetrolSedan::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("DaewooPetrolSedan::stop");
    }
}
