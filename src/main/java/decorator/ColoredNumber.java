package decorator;

import lombok.AllArgsConstructor;

public final class ColoredNumber implements Number {
    private final String color;
    private final Number number;

    public ColoredNumber(int number, String color) {
        this.number = new ImmutableNumber(number);
        this.color = color;
    }

    @Override
    public int get() {
        return number.get();
    }

    public String getColor() {
        return color;
    }
}
