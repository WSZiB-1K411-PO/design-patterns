package state;

import java.util.concurrent.ThreadLocalRandom;

public class NormalPrinter implements Printer {
    @Override
    public Printer print(String message) {
        System.out.println(message);

        if(ThreadLocalRandom.current().nextBoolean()) {
            return new UpperCasePrinter();
        } else {
            return new LowerCasePrinter();
        }
    }
}
