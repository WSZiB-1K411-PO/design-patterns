package decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class ImmutableNumber implements Number {
    private final int number;

    @Override
    public int get() {
        return number;
    }
}
