package memento;

import java.util.LinkedList;
import java.util.List;

public class RollbackNumber extends Number {
    private final LinkedList<Memento> history = new LinkedList<>();

    @Override
    public void add(int number) {
        history.add(getState());
        super.add(number);
    }

    @Override
    public void sub(int number) {
        history.add(getState());
        super.sub(number);
    }

    public void rollback() {
        if(history.isEmpty()) {
            return;
        }
        restore(history.pollLast());
    }
}
