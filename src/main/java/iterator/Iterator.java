package iterator;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Iterator<T> {
    private final List<T> list;
    public int i;

    public static <V> Iterator<V> of(final List<V> list) {
        return new Iterator<>(list, -1);
    }

    public boolean hasNext() {
        return list.size() - 1 > i;
    }

    public T next() {
        return list.get(++i);
    }

    public void reset() {
        i = -1;
    }
}
