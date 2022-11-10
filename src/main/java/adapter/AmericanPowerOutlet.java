package adapter;

public class AmericanPowerOutlet {
    void givePower(AmericanPowerConsumer consumer) {
        System.out.println("Giving 120V");
        consumer.run120V();
    }
}
