package lazy_initialization;

import lombok.Getter;
import lombok.SneakyThrows;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Getter
public class LazyService implements NumberService {
    private Integer a;
    private final long b;

    public LazyService() {
        b = generateB();
    }

    public int getA() {
        if(a == null) {
            a = generateA();
        }

        return a;
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
