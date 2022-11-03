package abstract_factory.daewoo;

import abstract_factory.Car;

public class DaewooDieselKombi implements Car {
    @Override
    public void startEngine() {
        System.out.println("DaewooDieselKombi::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("DaewooDieselKombi::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("DaewooDieselKombi::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("DaewooDieselKombi::stop");
    }
}
