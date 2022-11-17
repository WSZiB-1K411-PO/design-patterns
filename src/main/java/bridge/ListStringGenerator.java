package bridge;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ListStringGenerator extends StringGenerator {
    private final List<String> list;

    public ListStringGenerator(Printer printer, List<String> list) {
        super(printer);
        this.list = list;
    }

    @Override
    public void printNext() {
        int i = ThreadLocalRandom.current().nextInt(list.size());

        printer.print(list.get(i));
    }
}
