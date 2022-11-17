package bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class StringGenerator {
    protected final Printer printer;

    public abstract void printNext();
}
