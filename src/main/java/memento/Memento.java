package memento;

public record Memento (int number) {
    @Override
    public String toString() {
        return "" + number;
    }
}
