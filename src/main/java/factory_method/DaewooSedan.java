package factory_method;

public class DaewooSedan implements Car {
    @Override
    public void startEngine() {
        System.out.println("DaewooSedan::startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("DaewooSedan::stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("DaewooSedan::accelerate");
    }

    @Override
    public void stop() {
        System.out.println("DaewooSedan::stop");
    }
}
