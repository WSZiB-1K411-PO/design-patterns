package adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EuropeanToAmericanPowerAdapter implements AmericanPowerConsumer {
    private final EuropeanPowerConsumer consumer;
    @Override
    public void run120V() {
        System.out.println("Change 120V to 240V");
        consumer.run240V();
    }
}
