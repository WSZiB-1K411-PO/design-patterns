package bridge;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomStringGenerator extends StringGenerator {
    private static final String LETTERS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

    public RandomStringGenerator(Printer printer) {
        super(printer);
    }

    @Override
    public void printNext() {
        String string = Stream.generate(() -> ThreadLocalRandom.current().nextInt(LETTERS.length()))
                .limit(8)
                .map(integer -> LETTERS.charAt(integer) + "")
                .collect(Collectors.joining());

        printer.print(string);
    }
}
