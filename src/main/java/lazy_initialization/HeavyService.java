package lazy_initialization;

import lombok.Getter;
import lombok.SneakyThrows;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Getter
public class HeavyService implements NumberService {
    private final int a;
    private final long b;

    public HeavyService() {
        a = generateA();
        b = generateB();
    }

    @SneakyThrows
    private int generateA() {
        TimeUnit.SECONDS.sleep(5);

        return ThreadLocalRandom.current().nextInt(1, 11);
    }

    @SneakyThrows
    private long generateB() {
        return ThreadLocalRandom.current().nextLong(10, 21);
    }
}
