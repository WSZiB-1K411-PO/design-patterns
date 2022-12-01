package memento;

public class Number {
    private Memento state = new Memento(0);

    public void add(int number) {
        state = new Memento(state.number() + number);
    }

    public void sub(int number) {
        state = new Memento(state.number() - number);
    }

    public Memento getState() {
        return state;
    }

    public void restore(Memento memento) {
        state = memento;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
