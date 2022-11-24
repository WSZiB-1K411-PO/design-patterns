package strategy;

import java.util.Collection;
import java.util.List;

public interface Sorter<T> {
    List<T> sort(Collection<T> collection);
}
