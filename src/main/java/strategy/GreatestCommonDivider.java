package strategy;

import lombok.AllArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
public class GreatestCommonDivider {
    private final Sorter<Integer> sorter;

    List<Integer> compute(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return numbers;
        }

        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            int a = numbers.get(i);
            int b = numbers.get(i + 1);

            while(b != 0) {
                int t = b;
                b = a % b;
                a = t;
            }

            result.add(a);
        }

        return sorter.sort(result);
    }
}
