package chain_of_responsibility;

import java.util.List;

public class AddingChain extends Chain {
    public AddingChain(Chain next) {
        super(next);
    }

    public AddingChain() {
    }

    @Override
    protected List<Double> processInternal(List<Double> numbers, Chain next) {
        if(numbers.size() < 2) {
            return numbers;
        }

        Double a = numbers.remove(0);
        Double b = numbers.remove(0);

        numbers.add(0, a + b);

        if(next == null) {
            return numbers;
        }
        return next.process(numbers);
    }
}
