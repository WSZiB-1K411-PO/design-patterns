package adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AmericanToEuropeanPowerAdapter implements  EuropeanPowerConsumer {
    private final AmericanPowerConsumer consumer;
    @Override
    public void run240V() {
        System.out.println("Change 240V to 120V");
        consumer.run120V();
    }
}
