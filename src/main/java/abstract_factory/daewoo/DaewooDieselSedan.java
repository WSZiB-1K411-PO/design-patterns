package abstract_factory.daewoo;

import abstract_factory.Car;

public class DaewooDieselSedan implements Car {
    @Override
    public void startEngine() {
        System.out.println("DaewooDieselSedan::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("DaewooDieselSedan::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("DaewooDieselSedan::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("DaewooDieselSedan::stop");
    }
}
