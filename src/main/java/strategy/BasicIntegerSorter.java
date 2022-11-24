package strategy;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicIntegerSorter implements Sorter<Integer> {
    private final Comparator<Integer> comparator;

    public BasicIntegerSorter(Order order) {
        if(order == Order.ASC) {
            comparator = Comparator.naturalOrder();
        } else {
            comparator = Comparator.reverseOrder();
        }
    }

    @Override
    public List<Integer> sort(Collection<Integer> collection) {
        return collection.stream().sorted(comparator).collect(Collectors.toList());
    }

    public enum Order {
        ASC,
        DESC;
    }
}
