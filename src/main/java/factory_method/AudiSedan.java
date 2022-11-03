package factory_method;

public class AudiSedan implements Car {
    @Override
    public void startEngine() {
        System.out.println("AudiSedan::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("AudiSedan::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("AudiSedan::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("AudiSedan::stop");
    }
}
