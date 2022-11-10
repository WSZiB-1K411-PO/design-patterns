package adapter;

public class EuropeanPowerOutlet {
    void givePower(EuropeanPowerConsumer consumer) {
        System.out.println("Giving 240V");
        consumer.run240V();
    }
}
