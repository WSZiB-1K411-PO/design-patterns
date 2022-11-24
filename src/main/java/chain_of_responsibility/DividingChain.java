package chain_of_responsibility;

import java.util.List;

public class DividingChain extends Chain {
    public DividingChain(Chain next) {
        super(next);
    }

    public DividingChain() {
    }

    @Override
    protected List<Double> processInternal(List<Double> numbers, Chain next) {
        if (numbers.size() < 2) {
            return numbers;
        }

        Double a = numbers.remove(0);
        Double b = numbers.remove(0);

        if (b == 0) {
            throw new ArithmeticException("Division by 0");
        }

        numbers.add(0, a / b);

        if (next == null) {
            return numbers;
        }
        return next.process(numbers);
    }
}