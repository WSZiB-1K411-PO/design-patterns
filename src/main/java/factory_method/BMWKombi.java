package factory_method;

public class BMWKombi implements Car {
    @Override
    public void startEngine() {
        System.out.println("BMWKombi::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMWKombi::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("BMWKombi::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("BMWKombi::stop");
    }
}
