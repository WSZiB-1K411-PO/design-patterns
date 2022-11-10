package proxy;

import java.util.concurrent.ThreadLocalRandom;

public class BasicNumberGenerator implements NumberGenerator {
    @Override
    public int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(10, 21);
    }
}
