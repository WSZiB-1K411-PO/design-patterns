package iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Iterator<Integer> iterator = Iterator.of(List.of(1, 2, 3, 4, 5));

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.reset();
        System.out.println(iterator.next());
    }
}
