package abstract_factory.daewoo;

import abstract_factory.Car;

public class DaewooElectricKombi implements Car {
    @Override
    public void startEngine() {
        System.out.println("DaewooElectricKombi::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("DaewooElectricKombi::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("DaewooElectricKombi::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("DaewooElectricKombi::stop");
    }
}
