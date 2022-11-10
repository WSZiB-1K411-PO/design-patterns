package adapter;

public class AmericanLamp implements AmericanPowerConsumer {
    @Override
    public void run120V() {
        System.out.println("Consuming 120V and producing light.");
    }
}
