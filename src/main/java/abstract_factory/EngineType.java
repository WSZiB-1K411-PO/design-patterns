package abstract_factory;

import java.util.concurrent.ThreadLocalRandom;

public enum EngineType {
    PETROL,
    DIESEL,
    ELECTRIC;

    public static EngineType getRandom() {
        EngineType[] values = EngineType.values();
        int index = ThreadLocalRandom.current().nextInt(values.length);

        return values[index];
    }
}
