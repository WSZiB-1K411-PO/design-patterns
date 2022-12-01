import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {

    @Test
    void testGet() {
        ArrayList<Integer> arrayList = Stream.generate(() -> ThreadLocalRandom.current().nextInt(10, 20))
                .limit(10_000_000).collect(Collectors.toCollection(ArrayList::new));
        LinkedList<Integer> linkedList = Stream.generate(() -> ThreadLocalRandom.current().nextInt(10, 20))
                .limit(10_000_000).collect(Collectors.toCollection(LinkedList::new));

        long start = System.currentTimeMillis();
        arrayList.get(5_000_000);
        long end = System.currentTimeMillis();
        long arrayListResult = end - start;

        start = System.currentTimeMillis();
        linkedList.get(5_000_000);
        end = System.currentTimeMillis();
        long linkedListResult = end - start;

        assertTrue(linkedListResult > arrayListResult, linkedListResult + " > " + arrayListResult);
    }

    @Test
    void testRemove() {
        ArrayList<Integer> arrayList = Stream.generate(() -> ThreadLocalRandom.current().nextInt(10, 20))
                .limit(1_000_000_0).collect(Collectors.toCollection(ArrayList::new));
        LinkedList<Integer> linkedList = Stream.generate(() -> ThreadLocalRandom.current().nextInt(10, 20))
                .limit(1_000_000_0).collect(Collectors.toCollection(LinkedList::new));

        long start = System.currentTimeMillis();
        arrayList.remove(5_000);
        long end = System.currentTimeMillis();
        long arrayListResult = end - start;

        start = System.currentTimeMillis();
        linkedList.remove(5_000);
        end = System.currentTimeMillis();
        long linkedListResult = end - start;

        assertTrue(linkedListResult < arrayListResult, linkedListResult + " > " + arrayListResult);
    }
}
