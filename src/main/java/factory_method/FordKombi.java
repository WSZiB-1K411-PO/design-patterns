package factory_method;

public class FordKombi implements Car {
    @Override
    public void startEngine() {
        System.out.println("FordKombi::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("FordKombi::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("FordKombi::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("FordKombi::stop");
    }
}
