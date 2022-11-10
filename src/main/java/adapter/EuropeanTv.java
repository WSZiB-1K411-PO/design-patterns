package adapter;

public class EuropeanTv implements EuropeanPowerConsumer {
    @Override
    public void run240V() {
        System.out.println("Consuming 240V and you can watch a movie");
    }
}
