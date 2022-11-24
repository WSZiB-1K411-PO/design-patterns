package chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Chain {
    private Chain next;

    public List<Double> process(List<Double> numbers) {
        return processInternal(numbers, next);
    }

    protected abstract List<Double> processInternal(List<Double> numbers, Chain next);
}
